package com.example.todo.adapter.repository;

import com.example.todo.domain.Todo;
import com.example.todo.port.TodoRepositoryPort;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryTodoRepositoryAdapter implements TodoRepositoryPort {

  private final Map<String, Todo> todoStorage = new ConcurrentHashMap<>();

  @Override
  public void save(Todo todo) {
    todoStorage.put(todo.getId(), todo);
  }

  @Override
  public Optional<Todo> findById(String uuid) {
    return Optional.ofNullable(todoStorage.get(uuid));
  }

  @Override
  public List<Todo> findAll() {
    return new ArrayList<>(todoStorage.values());
  }

  @Override
  public void deleteById(String uuid) {
    todoStorage.remove(uuid);
  }
}
