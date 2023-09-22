package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("AdminArticleController")
@RequestMapping("/admin/article/")
public class ArticleController {
    
    @GetMapping("")
    public String index() {
        return "admin/artcile/index";
    }
    
}
