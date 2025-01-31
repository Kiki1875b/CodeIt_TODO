package com.example.todo.usecase.deleteTodo;

import com.example.todo.port.TodoRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class DeleteTodoService implements DeleteTodoUseCase {

  private final TodoRepositoryPort todoRepository;

  public DeleteTodoService(TodoRepositoryPort todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public DeleteTodoResult deleteTodo(String id) {
    todoRepository.deleteById(id);
    return new DeleteTodoResult("TODO item successfully deleted");
  }
}
