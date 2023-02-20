package com.practice.SpringBoot.myFirstToDoWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

//    http://localhost:8081/login?name=ravi
    @RequestMapping("login")
    public String gotoLoginPage(@RequestParam String name, ModelMap model){
        model.put("name",name);
        System.out.println("Request param is :"+ name);
        return "login";
    }
}
