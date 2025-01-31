package com.example.todo.usecase.updateTodo;

import com.example.todo.domain.Todo;
import com.example.todo.port.TodoRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class UpdateTodoService implements UpdateTodoUseCase{

  private final TodoRepositoryPort todoRepository;

  public UpdateTodoService(TodoRepositoryPort todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public UpdateTodoResult updateTodo(String id, UpdateTodoCommand command) {
    Todo todo = todoRepository.findById(id).orElseThrow(
        () -> new IllegalArgumentException()
    );

    todo.update(command.getTitle(), command.getDetails(), command.isCompleted());

    todoRepository.save(todo);

    return new UpdateTodoResult(todo.getId(), todo.getTitle(), todo.getDetails(), todo.getCreatedAt(), todo.getUpdatedAt(), todo.isCompleted());
  }
}
