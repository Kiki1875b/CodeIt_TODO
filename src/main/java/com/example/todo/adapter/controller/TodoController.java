package com.example.todo.adapter.controller;

import com.example.todo.usecase.createTodo.CreateTodoCommand;
import com.example.todo.usecase.createTodo.CreateTodoResult;
import com.example.todo.usecase.createTodo.CreateTodoService;
import com.example.todo.usecase.createTodo.CreateTodoUseCase;
import com.example.todo.usecase.deleteTodo.DeleteTodoResult;
import com.example.todo.usecase.deleteTodo.DeleteTodoUseCase;
import com.example.todo.usecase.getTodo.*;
import com.example.todo.usecase.updateTodo.UpdateTodoCommand;
import com.example.todo.usecase.updateTodo.UpdateTodoResult;
import com.example.todo.usecase.updateTodo.UpdateTodoService;
import com.example.todo.usecase.updateTodo.UpdateTodoUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

  private final CreateTodoUseCase createTodoService;
  private final GetTodoListUseCase getTodoListService;
  private final UpdateTodoUseCase updateTodoService;
  private final GetTodoUseCase getTodoService;
  private final DeleteTodoUseCase deleteTodoService;

  public TodoController(CreateTodoUseCase createTodoService,
                        GetTodoListUseCase getTodoListService,
                        UpdateTodoUseCase updateTodoService,
                        GetTodoUseCase getTodoService,
                        DeleteTodoUseCase deleteTodoService) {

    this.createTodoService = createTodoService;
    this.getTodoListService = getTodoListService;
    this.updateTodoService = updateTodoService;
    this.getTodoService = getTodoService;
    this.deleteTodoService = deleteTodoService;
  }

  @PostMapping("/api/todo")
  public CreateTodoResult createTodo(@RequestBody CreateTodoCommand command){
    return createTodoService.createTodo(command);
  }

  @GetMapping("/api/todo")
  public GetTodoListResult getTodoList(){
    return getTodoListService.getTodoList();
  }

  @GetMapping("/api/todo/{id}")
  public GetTodoResult getTodo(@PathVariable String id){
    return getTodoService.getTodo(id);
  }

  @PutMapping("/api/todo/{id}")
  public UpdateTodoResult updateTodo(@PathVariable String id, @RequestBody UpdateTodoCommand command){
    return updateTodoService.updateTodo(id, command);
  }

  @DeleteMapping("/api/todo/{id}")
  public DeleteTodoResult deleteTodo(@PathVariable String id){
    System.out.println(deleteTodoService.deleteTodo(id));
    return deleteTodoService.deleteTodo(id);
  }

}
