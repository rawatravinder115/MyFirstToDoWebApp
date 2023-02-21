package com.practice.SpringBoot.myFirstToDoWebApp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoServices {

    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;
    static{
        todos.add(new Todo(++todosCount,"practice","learn spring boot", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(++todosCount,"practice","learn spring security", LocalDate.now().plusYears(2),false));
        todos.add(new Todo(++todosCount,"practice","learn devOps", LocalDate.now().plusYears(3),false));
        todos.add(new Todo(++todosCount,"practice","learn Cloud", LocalDate.now().plusYears(4),false));
    }

    public static List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username,String description,
                        LocalDate targetdate,boolean done){
        Todo todo = new Todo(++todosCount,username,description,targetdate,done);
        todos.add(todo);
    }

    public  void deleteById(int id ){
        // tod.getId() == id
        // todo -> todo.getId() == id
        Predicate<? super Todo> predicate
                = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public  Todo findById(int id ){
        // tod.getId() == id
        // todo -> todo.getId() == id
        Predicate<? super Todo> predicate
                = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void  updateTodo( Todo todo){
        deleteById(todo.getId());
        todos.add(todo);

    }
}
