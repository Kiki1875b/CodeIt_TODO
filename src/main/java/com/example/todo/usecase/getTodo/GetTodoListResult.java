package com.example.todo.usecase.getTodo;

import com.example.todo.domain.Todo;
import lombok.Getter;

import java.util.List;

@Getter
public class GetTodoListResult {
  private final List<Todo> todoList;

  public GetTodoListResult(List<Todo> todoList) {
    this.todoList = todoList;
  }
}
