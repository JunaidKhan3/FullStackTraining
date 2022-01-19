package com.springsecurityjpa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.springsecurityjpa.MyUserDetailsService;
//import com.springsecurityjpa.filter.JwtAuthenticationFilter;


@EnableWebSecurity
@Configuration
public class SpringConfigure extends WebSecurityConfigurerAdapter {
    
//	@Autowired
//	private JwtAuthenticationFilter jwtFilter;
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	// TODO Auto-generated method stub
	auth.userDetailsService(userDetailsService);
}
	

//	@Override
//	@Bean
//	protected AuthenticationManager authenticationManager() throws Exception {
//		// TODO Auto-generated method stub
//		return super.authenticationManager();
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// TODO Auto-generated method stub
//		http.csrf().disable()
//		     .authorizeRequests()
//		     .antMatchers("/token").permitAll()
//		     .anyRequest().authenticated()
//		     .and()
//		     .sessionManagement()
//		     .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//		
//		http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
//	}

	
@Override
public void configure(HttpSecurity http) throws Exception {
	http.csrf().disable().authorizeRequests()
	.antMatchers("/admin").hasRole("ADMIN")
	.antMatchers("/user").hasAnyRole("USER","ADMIN")
	.antMatchers("/").permitAll()
//	.antMatchers("/register").permitAll()
	.and().formLogin();
}
	
}
