package com.example.todo.usecase.createTodo;

import com.example.todo.port.TodoRepositoryPort;
import com.example.todo.domain.Todo;
import org.springframework.stereotype.Service;

@Service
public class CreateTodoService implements CreateTodoUseCase{

  private final TodoRepositoryPort todoRepository;

  public CreateTodoService(TodoRepositoryPort todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public CreateTodoResult createTodo(CreateTodoCommand command) {
    Todo todo = Todo.create(command.getTitle(), command.getDetails());
    todoRepository.save(todo);
    return new CreateTodoResult(todo.getId(), todo.getTitle(), todo.getDetails(), todo.getCreatedAt(), todo.isCompleted());
  }
}
