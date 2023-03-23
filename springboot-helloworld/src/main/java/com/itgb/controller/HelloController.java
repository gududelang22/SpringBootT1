package com.itgb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/h1")
    public String HelloWorld(){
        return "我不理解";
    }
    @RequestMapping("h2")
    public String HelloWorld01(){
        return "我不理解01";
    }
}
