package com.example.todo.usecase.getTodo;

import com.example.todo.domain.Todo;
import com.example.todo.port.TodoRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class GetTodoService implements GetTodoUseCase{

  private final TodoRepositoryPort todoRepository;

  public GetTodoService(TodoRepositoryPort todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public GetTodoResult getTodo(String id) {
    Todo todo = todoRepository.findById(id).orElseThrow(
        () -> new IllegalArgumentException()
    );
    return new GetTodoResult(todo.getId(), todo.getTitle(), todo.getDetails(), todo.getCreatedAt(), todo.isCompleted());
  }
}
