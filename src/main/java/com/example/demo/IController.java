package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IController {
    @GetMapping("/")
    public String indexPage(){
        System.out.println("index Page");
        return "index";
    }
    @GetMapping("/home")
    public String homePage(){
        System.out.println("Home Page");
        return "home";
    }
}
