package com.springcourse.todo;

import com.springcourse.todo.model.Todo;
import com.springcourse.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;


@SpringBootApplication
public class TodoApplication {

	@Autowired // injetando dependência
	private TodoRepository todoRepository;
	@Bean // testando a aplicação
	public CommandLineRunner init() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Todo todo = new Todo();
				todo.setDescription("Learn Spring Boot");
				todo.setCreatedDate(LocalDateTime.now());
				todoRepository.save(todo);
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
