package br.com.coontrol.ctrl.api.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.coontrol.ctrl.api.model.Pessoa;


@RepositoryRestResource(collectionResourceRel = "pessoa", path = "pessoas")
public interface PessoaRepository extends PagingAndSortingRepository<Pessoa, Long>{

	/**
	 *  Método que retorna a lista de cliente por nome
	 *  
	 *  @param nome
	 *  return lista de clientes
	 * 
	 */
	List<Pessoa> buscarClientesPorNome(@Param("nome") String nome);
	
	/**
	 *  Método que retorna um cliente por cpf
	 *  
	 *  @param cpf
	 *  return Cliente
	 * 
	 */
	Pessoa buscarClientePorCpf(@Param("cpf") String cpf);
	
}
