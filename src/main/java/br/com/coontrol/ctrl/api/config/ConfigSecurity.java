package br.com.coontrol.ctrl.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.savedrequest.NullRequestCache;

@Configuration
@EnableWebSecurity
public class ConfigSecurity extends WebSecurityConfigurerAdapter {
	
	private static final String VALOR_PADRAO = "coontrol";

	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.inMemoryAuthentication().withUser(ConfigSecurity.VALOR_PADRAO)
          .password(encoder.encode(ConfigSecurity.VALOR_PADRAO)).roles("USER");
    }
	
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests() 
		.anyRequest().authenticated()
		.and().requestCache().requestCache(new NullRequestCache())
		.and().httpBasic()
		.and().csrf().disable();
	}
}
