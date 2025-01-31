package com.example.todo.usecase.updateTodo;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UpdateTodoResult {
  private final String todoId;
  private final String title;
  private final String detail;
  private final LocalDateTime createdAt;
  private final LocalDateTime updatedAt;
  private final boolean completed;

  public UpdateTodoResult(String todoId,
                          String title,
                          String detail,
                          LocalDateTime createdAt,
                          LocalDateTime updatedAt,
                          boolean completed) {
    this.todoId = todoId;
    this.title = title;
    this.detail = detail;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.completed = completed;
  }
}
