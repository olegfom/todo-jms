package com.apress.todo.todojms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.apress.todo"})
@EntityScan(basePackages = {"com.apress.todo.domain"} )
@EnableJpaRepositories(basePackages = {"com.apress.todo.repository"})
public class TodoJmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoJmsApplication.class, args);
	}

}
