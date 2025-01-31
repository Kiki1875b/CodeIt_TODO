package com.example.todo.usecase.updateTodo;

public interface UpdateTodoUseCase {
  UpdateTodoResult updateTodo(String id, UpdateTodoCommand command);
}
