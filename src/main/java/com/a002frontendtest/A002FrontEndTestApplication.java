package com.a002frontendtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class A002FrontEndTestApplication {
/* 0610 2022
lavet denne for at teste om jeg kan få data fra min backend (json) på azure til denne. test succes case: hvisj eg
kan få dette projekt til at vise json data modtaget fra det andet backend projekt.
denne kører på port 8081
 */
    public static void main(String[] args) {
        SpringApplication.run(A002FrontEndTestApplication.class, args);
    }

}
