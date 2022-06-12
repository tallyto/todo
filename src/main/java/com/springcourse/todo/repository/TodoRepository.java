package com.springcourse.todo.repository;

import com.springcourse.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
// Model -> Todo
// Id -> Long
public interface TodoRepository extends JpaRepository<Todo,Long > {


}
