package br.com.deivison.cad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.deivison.cad.model.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> ,PagingAndSortingRepository<Pessoa, Long> {

}
