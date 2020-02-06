package com.hellodong.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller2 {
    @RequestMapping("/hello2")
    public String hel(){
        return "hello nihao hello2";
    }
}
