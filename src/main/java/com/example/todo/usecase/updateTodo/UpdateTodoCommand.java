package com.example.todo.usecase.updateTodo;

import lombok.Getter;

@Getter
public class UpdateTodoCommand {
  private String title;
  private String details;
  private boolean completed;

  public UpdateTodoCommand(String title, String details, boolean completed) {
    this.title = title;
    this.details = details;
    this.completed = completed;
  }
}
