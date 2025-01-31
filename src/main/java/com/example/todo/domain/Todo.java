package com.example.todo.domain;

import lombok.Getter;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Todo {
  private final String id;
  private String title;
  private String details;
  private boolean completed;
  private final LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private LocalDateTime completedAt;

  private Todo(String title, String details) {
    this.id = UUID.randomUUID().toString();
    this.title = title;
    this.details = details;
    this.completed = false;
    this.createdAt = LocalDateTime.now();
    this.updatedAt = createdAt;
  }

  public static Todo create(String title, String details) {
    return new Todo(title, details);
  }

  public void update(String title, String details, boolean completed) {
    this.title = title;
    this.details = details;
    this.completed = completed;
    this.updatedAt = LocalDateTime.now();
    if (completed) {
      this.completedAt = LocalDateTime.now();
    } else {
      this.completedAt = null;
    }
  }
}
