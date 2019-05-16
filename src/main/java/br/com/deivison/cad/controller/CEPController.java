package br.com.deivison.cad.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.deivison.cad.business.BuscaCEP;
import br.com.deivison.cad.model.CEP;

@RestController
@RequestMapping("/cep")
public class CEPController {
	
	private Logger log = LoggerFactory.getLogger(CEPController.class);
	
	@Autowired
	private BuscaCEP buscaCEP;
	
	@GetMapping(value="/{cep}")
	@Cacheable(value="/cep_get")
	public CEP test(@PathVariable String cep){
		CEP cepResult  = buscaCEP.consultaCEP(cep);
		
		log.info("resultado busca " + cepResult.toString());
		return cepResult;
	}
	
	@PostMapping()
	@Cacheable(value="cep_post")
	public List<CEP> listaCEP(@RequestBody List<String> ceps){
		List<CEP> listaCEP = new ArrayList<CEP>();
		
		if(ceps != null && ceps.size() > 0)
			ceps.forEach(s -> listaCEP.add(buscaCEP.consultaCEP(s)));
		
		return listaCEP;
	}
	
	
}
