package com.example.spring_todo_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TodoController {

    @Autowired
   TodoRepository todoRepository;

    @GetMapping("/alltodo")
    public List<Todo> getAll() {
        return todoRepository.getAll();
    }

    @PostMapping("/add")
    public void addTask(@RequestBody String task) {
        todoRepository.addTask(task);
    }

    @DeleteMapping("/delete/{id}")
    public int deleteTask(@PathVariable("id") int id) {
        return todoRepository.deleteTask(id);
    }

}
