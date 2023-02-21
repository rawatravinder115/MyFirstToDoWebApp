package com.practice.SpringBoot.myFirstToDoWebApp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    private TodoServices todoServices;

    // list-todos
    @RequestMapping(value = "list-todos")
    public String listAllTodos(ModelMap model){
        List<Todo> todos = todoServices.findByUsername("practice");
        model.addAttribute("todos",todos);
        return "listTodos";
    }
}
