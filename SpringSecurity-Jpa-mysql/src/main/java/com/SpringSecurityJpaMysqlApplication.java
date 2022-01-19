package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springsecurityjpa.UserRepository;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpaMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaMysqlApplication.class, args);
	}
	@Bean
	public PasswordEncoder getpasswordencoder() {return NoOpPasswordEncoder.getInstance();}
}
