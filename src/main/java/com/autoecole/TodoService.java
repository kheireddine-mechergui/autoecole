package com.autoecole;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TodoService {

    @GetMapping(value = {"/todos/" , "/todos"})
    List<?> getTodos() {
        return Arrays.asList(
                new Todo(0L , "Todo 001", "Description Of Todo 001"),
                new Todo(0L , "Todo 002", "Description Of Todo 002"),
                new Todo(0L , "Todo 003", "Description Of Todo 003"),
                new Todo(0L , "Todo 004", "Description Of Todo 004"),
                new Todo(0L , "Todo 005", "Description Of Todo 005"),
            new Todo(0L , "Todo 0055", "Description Of Todo 0054"),
                new Todo(0L , "Todo 077", "Description Of Todo 077")
        );
    }
}
