package com.hellodong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocon {
    @RequestMapping("/hello")
    public String hel(){
        return "hello nihao";
    }
}
