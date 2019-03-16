package br.com.coontrol.ctrl.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.coontrol.ctrl.api.model.Pessoa;


@RepositoryRestResource(collectionResourceRel = "pessoa", path = "pessoas")
public interface PessoaRepository extends PagingAndSortingRepository<Pessoa, Long>{


	
}
