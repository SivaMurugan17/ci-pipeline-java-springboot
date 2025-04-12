package com.siva.ci_pipeline_java_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetController {

    @GetMapping
    public String greet(){
        return "Hiya, how it's going?";
    }
}
