package com.springcourse.todo.repository;

import com.springcourse.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long > {
    // interface -> interface de acesso ao banco de dados



}
