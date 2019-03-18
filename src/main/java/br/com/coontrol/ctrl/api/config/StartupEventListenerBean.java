package br.com.coontrol.ctrl.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.coontrol.ctrl.api.model.Usuario;
import br.com.coontrol.ctrl.api.repository.UsuarioRepository;

@Component
public class StartupEventListenerBean {
	
	@Autowired
    private UsuarioRepository usuarioRepository;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(usuarioRepository.findByUsuario("coontrol") == null) {
            Usuario user = new Usuario();
            user.setUsuario("coontrol");
            user.setSenha("1234");
            user.setRole("ROLE_USER");
            usuarioRepository.save(user);
        }
    }

}
