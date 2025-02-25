package com.example.todo.usecase.createTodo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CreateTodoCommand {
  private String title;
  private String details;
}
