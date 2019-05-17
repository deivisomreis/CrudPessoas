package br.com.deivison.cad.utils;

import lombok.extern.slf4j.Slf4j;
import br.com.deivison.cad.model.CEP;
import br.com.deivison.cad.model.Endereco;

@Slf4j
public class CepToEnderecoProperties {
	
	public static Endereco copyProperties(CEP cep){
		log.info("copyProperties");
		
		Endereco end = new Endereco();
		
		end.setBairro(cep.getBairro());
		end.setCep(cep.getCep());
		end.setCidade(cep.getLocalidade());
		end.setEstado(cep.getUf());
		
		return end;
	}

}
