package com.a002frontendtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello from helloController in A002FrontEndTest");
        return "hello from hellconro in A002FrontTest";
    }
}
