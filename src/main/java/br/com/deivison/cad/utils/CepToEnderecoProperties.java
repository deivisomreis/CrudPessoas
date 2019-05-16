package br.com.deivison.cad.utils;

import br.com.deivison.cad.model.CEP;
import br.com.deivison.cad.model.Endereco;

public class CepToEnderecoProperties {
	
	public static Endereco copyProperties(CEP cep){
		Endereco end = new Endereco();
		
		end.setBairro(cep.getBairro());
		end.setCep(cep.getCep());
		end.setCidade(cep.getLocalidade());
		end.setEstado(cep.getUf());
		
		return end;
	}

}
