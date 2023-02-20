package com.practice.SpringBoot.myFirstToDoWebApp.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

	// http://localhost:8081/say-hello
	@RequestMapping("say-hello")
	@ResponseBody // because mvc looking for a view (return "string")
					// so this annotation convert the view into as it is
	public String sayHello(){
		return "Hello. what are you learning today?";
	}

}
