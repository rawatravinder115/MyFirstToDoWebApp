package com.practice.SpringBoot.myFirstToDoWebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class loginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AuthenticationService authenticationService;

//    http://localhost:8081/login?name=ravi
//    @RequestMapping("login")
//    public String gotoLoginPage(@RequestParam String name, ModelMap model){
//        model.put("name",name);
//        logger.debug("Request Param is {} :",name);
//        System.out.println("Request param is :"+ name);
//        return "login";
//    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String gotoLoginPage(){
        return "login";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name,
                                  @RequestParam String password,ModelMap model
                                  ){

        if(authenticationService.authenticate(name,password)){
            model.put("name", name);
            model.put("password", password);
//        Authentication
//        name - ravi
//        password - 1234
            return "welcome";
        }

        model.put("errorMessage","Invalid Credentials ! please login again");
        return "login";
    }

}
