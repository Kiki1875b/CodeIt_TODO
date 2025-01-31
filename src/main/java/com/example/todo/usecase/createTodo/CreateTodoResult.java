package com.example.todo.usecase.createTodo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
public class CreateTodoResult {
  private final String todoId;
  private final String title;
  private final String details;
  private final LocalDateTime createdAt;
  private final boolean completed;

  public CreateTodoResult(String todoId, String title, String details, LocalDateTime createdAt, boolean completed) {
    this.todoId = todoId;
    this.title = title;
    this.details = details;
    this.createdAt = createdAt;
    this.completed = completed;
  }
}
