package com.guoguo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  
public class MainController {  
      @RequestMapping("/")   
      @ResponseBody  
      String home() {
        System.out.println("microservice start Successfully!");
        return "springboot microservice Successfully!";
      }
}
