package com.a002frontendtest.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
    final String apiAddress = "https://web001backtest.azurewebsites.net/mice/";
  //  final String apiAddress = "http://localhost:8080/mice/"; //hardcoded endpoint til test

    RestTemplate rest = new RestTemplate();

    public String getInfo(){
        System.out.println("getinfo running inside Apiservice inside A002FrontEndTest ...");
//ResponseEntity<String> response = rest.getForEntity(apiAddress, req, String.class);
        String response = rest.getForObject(apiAddress, String.class);
        System.out.println(response);
        return "ok!";
    }
}
