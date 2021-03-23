package com.springboot.bm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication

public class BookManagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookManagerApplication.class, args);
	}
//	@Bean(name="entityManagerFactory”)
//	public LocalSessionFactoryBean sessionFactory() {
//	LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//	return sessionFactory;
//	}

}
