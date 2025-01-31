package com.example.todo.usecase.getTodo;

import com.example.todo.port.TodoRepositoryPort;
import com.example.todo.domain.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetTodoListService implements GetTodoListUseCase{

  private final TodoRepositoryPort todoRepository;

  public GetTodoListService(TodoRepositoryPort todoRepository) {
    this.todoRepository = todoRepository;
  }
  @Override
  public GetTodoListResult getTodoList() {
    List<Todo> todos = todoRepository.findAll();
    return new GetTodoListResult(todos);
  }
}
