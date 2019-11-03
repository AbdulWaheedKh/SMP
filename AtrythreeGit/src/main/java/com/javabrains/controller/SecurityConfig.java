package com.javabrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	/*
	 * @Autowired UserDetailsService userDetailsService;
	 * 
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	// Roles Are defined here 
	
		/* auth.userDetailsService(userDetailsService); */
		
		auth.inMemoryAuthentication() .withUser("admin").password("pass").roles("ADMIN");
		
		 auth.inMemoryAuthentication() .withUser("ceo").password("pass").roles("CEO");
		  
		  auth.inMemoryAuthentication()
		  .withUser("business").password("pass").roles("BusinessHead");
		  
		  
		  auth.inMemoryAuthentication()
		  .withUser("region").password("pass").roles("RegionalHead");
		  
		  
		  auth.inMemoryAuthentication()
		  .withUser("area").password("pass").roles("AreaManager");
		  
		 
		  	auth.inMemoryAuthentication()
		  .withUser("sale").password("pass").roles("SalesMan");
		 
	
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	//higher to lower restrickted
		

		http.authorizeRequests()
		.antMatchers("/").authenticated()
		.antMatchers("/home").hasRole("ADMIN")
		.antMatchers("/Ceo").hasRole("CEO")
		.antMatchers("/BusinessHead").hasRole("BusinessHead")
		.antMatchers("/RegionalManager").hasRole("RegionalHead")
		.antMatchers("/AreaManager").hasRole("AreaManager")
		.antMatchers("/SaleMan").hasRole("SalesMan")
		
		.and()
		.formLogin()
		.loginPage("/login")
		
		.loginProcessingUrl("/AutheticateUser")
		.permitAll()
		
		.and()
		.logout()
		.permitAll()
		
		.and()
		.exceptionHandling().accessDeniedPage("/Access-Denied");
		
		
		
		
	
	
	}
	

	/*
	 * @Bean public PasswordEncoder passwordEncoder() { return new
	 * BCryptPasswordEncoder(); }
	 * 
	 */	
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		// NoOpPasswordEncoder.getInstance(); to store pw in text format not hashed
		return NoOpPasswordEncoder.getInstance();

	}

	
	
	
}
