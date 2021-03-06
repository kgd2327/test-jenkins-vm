package com.demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test1/{id}")
    public String test1(@PathVariable("id") String id){
        return "ok test1 + "+id;
    }
    @GetMapping("/")
    public String test2(){
        return "ok test22222";
    }
    @GetMapping("/test3/{id}")
    public String test3(@PathVariable("id") Integer id){
        return "ok test3 + "+id;
    }
}
