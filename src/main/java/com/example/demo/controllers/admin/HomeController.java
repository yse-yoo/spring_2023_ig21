package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("AdminHomeController")
@RequestMapping("/admin/")
public class HomeController {
    
    @GetMapping("")
    public String index() {
        // templates/admin/index.html がレンダリング
        return "admin/index";
    }
    
    @GetMapping("hello")
    public String hello() {
        // templates/admin/index.html がレンダリング
        return "admin/index";
    }
}
