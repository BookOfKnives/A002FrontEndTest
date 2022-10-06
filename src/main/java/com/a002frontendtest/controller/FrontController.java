package com.a002frontendtest.controller;

import com.a002frontendtest.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    private ApiService apiService;
    public FrontController(ApiService apiService) {this.apiService = apiService;}

    @GetMapping("/call")
    public String first(){
String message = apiService.getInfo();
return message;
    }

}
