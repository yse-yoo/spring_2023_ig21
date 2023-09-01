package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller("AdminHomeController")
public class HomeController {
    
    @GetMapping(value="/admin/")
    public String index() {
        // templates/admin/index.html がレンダリング
        return "admin/index";
    }
    
}
