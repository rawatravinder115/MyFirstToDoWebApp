package com.practice.SpringBoot.myFirstToDoWebApp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServices {

    private static List<Todo> todos = new ArrayList<>();
    static{
        todos.add(new Todo(1,"practice","learn spring boot", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(2,"practice","learn spring security", LocalDate.now().plusYears(2),false));
        todos.add(new Todo(3,"practice","learn devOps", LocalDate.now().plusYears(3),false));
        todos.add(new Todo(4,"practice","learn Cloud", LocalDate.now().plusYears(4),false));
    }

    public static List<Todo> findByUsername(String username) {
        return todos;
    }
}
