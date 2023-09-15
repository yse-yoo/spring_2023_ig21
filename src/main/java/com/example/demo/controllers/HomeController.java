package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller("HomeController")
public class HomeController {
    
    @GetMapping(value="/")
    public String index() {
        // templates/home/sample.html をレンダリング
        return "home/sample";
    }
    
}
