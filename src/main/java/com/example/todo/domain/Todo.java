package com.example.todo.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Todo {
  private final String uuid;
  private String title;
  private String details;
  private final LocalDateTime createdAt;
  private boolean completed;
  private LocalDateTime updatedAt;
  private LocalDateTime completedAt;

  private Todo(String title, String details){
    this.uuid = UUID.randomUUID().toString();
    this.title = title;
    this.details = details;
    this.createdAt = LocalDateTime.now();
    this.completed = false;
    this.updatedAt = LocalDateTime.now();
  }

  private Todo(Todo todo){
    this.uuid = todo.getUuid();
    this.title = todo.getTitle();
    this.details = todo.getDetails();
    this.createdAt = todo.getCreatedAt();
    this.completed = todo.isCompleted();
    this.updatedAt = LocalDateTime.now();
  }

  /**
   * 필드는 클라이언트에서 검증
   * @param title
   * @param details
   */
  public static Todo create(String title, String details){
    return new Todo(title, details);
  }

  public static Todo create(Todo todo){
    return new Todo(todo);
  }

  public void updateDetail(String details){
    this.details = details;
    updatedAt = LocalDateTime.now();
  }

  public void complete(){
    this.completed = true;
    updatedAt = LocalDateTime.now();
    completedAt = LocalDateTime.now();
  }

  public void inComplete(){
    this.completed = false;
    updatedAt = LocalDateTime.now();
    completedAt = null;
  }
}
