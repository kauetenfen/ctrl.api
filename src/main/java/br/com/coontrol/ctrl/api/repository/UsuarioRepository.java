package br.com.coontrol.ctrl.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.coontrol.ctrl.api.model.Usuario;

@Repository
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long>{
	 Usuario findByUsuario(String usuario);	
}
