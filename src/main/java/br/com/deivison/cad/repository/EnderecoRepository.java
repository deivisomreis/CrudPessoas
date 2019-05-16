package br.com.deivison.cad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.deivison.cad.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> ,PagingAndSortingRepository<Endereco, Long> {

}
