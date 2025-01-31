package com.example.todo.usecase.getTodo;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GetTodoResult {
  private final String uuid;
  private final String title;
  private final String details;
  private final LocalDateTime createdAt;
  private final boolean completed;

  public GetTodoResult(String uuid, String title, String details, LocalDateTime createdAt, boolean completed) {
    this.uuid = uuid;
    this.title = title;
    this.details = details;
    this.createdAt = createdAt;
    this.completed = completed;
  }
}
