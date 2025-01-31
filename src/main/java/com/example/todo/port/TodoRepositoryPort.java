package com.example.todo.port;

import com.example.todo.domain.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoRepositoryPort {
  void save(Todo todo);
  Optional<Todo> findById(String uuid);
  List<Todo> findAll();
  void deleteById(String uuid);
}
