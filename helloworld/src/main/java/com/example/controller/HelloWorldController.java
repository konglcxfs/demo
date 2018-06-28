package com.example.controller;

import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping(value = "/{name}",method = {RequestMethod.GET})
    public String sayHello(@PathVariable("name") String name){
        String word = exampleService.replaceStr(name,"a");
        return "你好"+word;
    }

}
