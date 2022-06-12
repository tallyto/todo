package com.springcourse.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TodoApplication {
	@GetMapping("/")
	public String hello(){
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}