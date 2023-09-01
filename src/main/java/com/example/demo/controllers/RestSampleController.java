package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class RestSampleController {

    // get または method と入力して、GetMappingを選んで自動入力して修正
    @GetMapping(value = "/hello")
    public String index() {
        return "Hello!!!";
    }

}
