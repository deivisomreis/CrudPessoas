package br.com.deivison.cad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.deivison.cad.model.Endereco;
import br.com.deivison.cad.model.Pessoa;
import br.com.deivison.cad.repository.EnderecoRepository;
import br.com.deivison.cad.repository.PessoaRepository;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired 
	private EnderecoRepository enderecoRepository;
	
	@RequestMapping(method = RequestMethod.POST)
//	@Cacheable(sync=false)
	public String cadastrar(Pessoa pessoa, Endereco endereco, Model model){
		endereco = enderecoRepository.save(endereco);
		pessoa.setEndereco(endereco);
		pessoa = pessoaRepository.save(pessoa);
		
		model.addAttribute("status", pessoa.getNome() + " cadastrado com sucesso!");
		
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String form(){
		return "index";
	}

}
