package com.practice.SpringBoot.myFirstToDoWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username,String password){
        boolean isValidUserName = username.equalsIgnoreCase("ravi");
        boolean isValidPassword = password.equalsIgnoreCase("1234");

        return isValidPassword && isValidUserName;
    }
}
