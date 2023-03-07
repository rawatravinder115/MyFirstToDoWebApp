package com.practice.SpringBoot.myFirstToDoWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    // http://localhost:8081/say-hello
    @RequestMapping("say-hello")
    @ResponseBody // because mvc looking for a view (return "string")
    // so this annotation convert the view into as it is
    public String sayHello() {
        return "Hello. what are you learning today?";
    }

    @ResponseBody
    @RequestMapping("say-hello-html")
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My First HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My First Html Page with Body- changed");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    // JSP - java server pages
    // say-hello-jsp => sayHello.jsp
    // src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }

}
