package com.example.todo.usecase.deleteTodo;

import lombok.Getter;

@Getter
public class DeleteTodoResult {
  private final String message;
  public DeleteTodoResult(String message) {
    this.message = message;
  }
}
