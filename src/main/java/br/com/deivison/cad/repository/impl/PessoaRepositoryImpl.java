package br.com.deivison.cad.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.deivison.cad.repository.PessoaRepository;

@Service
public class PessoaRepositoryImpl {

	@Autowired
	private PessoaRepository pessoaRepository;
}
