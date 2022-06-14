package com.springcourse.todo.rest;

import com.springcourse.todo.model.Todo;
import com.springcourse.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController // indica que a classe é um controlador REST
@RequestMapping("/api/todos") // indica o caminho da API
public class TodoController {
    @Autowired // injeta o repositório
    private TodoRepository repository;

    @PostMapping
    public Todo save(@RequestBody Todo todo) { // recebe o todo via JSON
        return repository.save(todo);
    }

    @GetMapping("{id}")
    public Todo getById(@PathVariable Long id) {
        return repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
                // se não encontrar o todo, lança exceção

    }
}
