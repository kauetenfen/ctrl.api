package br.com.coontrol.ctrl.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.savedrequest.NullRequestCache;

@Configuration
public class ConfigSecurity extends WebSecurityConfigurerAdapter {
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) 
      throws Exception {
        auth.inMemoryAuthentication().withUser("coontrol")
          .password("coontrol").roles("USER");
    }
	
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests() 
		.anyRequest().authenticated()
		.and().requestCache().requestCache(new NullRequestCache())
		.and().httpBasic()
		.and().csrf().disable();
	}
}
