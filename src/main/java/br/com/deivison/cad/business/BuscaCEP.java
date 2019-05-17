package br.com.deivison.cad.business;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.deivison.cad.model.CEP;

@Service
@Slf4j
public class BuscaCEP {

//	private Logger log = LoggerFactory.getLogger(BuscaCEP.class);

	@Autowired
	private RestTemplate restTemplate;
	private final String url = "https://viacep.com.br/ws/cep/json/";
	
	public CEP consultaCEP(String cep){
		log.info("cep entrada: " + cep);
		return restTemplate.getForObject(url.replace("/cep", "/" + cep), CEP.class);
	}
}
