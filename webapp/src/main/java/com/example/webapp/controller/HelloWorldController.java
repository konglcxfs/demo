package com.example.webapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = "/{name}",method = {RequestMethod.GET})
    public String sayHello(@PathVariable("name") String name){

        return "你好"+name;
    }

}
