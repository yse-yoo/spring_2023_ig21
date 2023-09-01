package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class RestSampleController {

    // get または method と入力して、GetMappingを選んで自動入力して修正
    @GetMapping(value = "/hello")
    public String index() {
        return "Hello!!!";
    }

    @GetMapping(value="/bye")
    public String bye(@RequestParam(name = "name", required = false) String param) {
        String message = "Bye! " + param;
        return message;
    }

    @GetMapping(value="/users/{userId}")
    public String getUser(@PathVariable Long userId) {
        String message = "User ID is " + userId;
        return message;
    }

    
}
