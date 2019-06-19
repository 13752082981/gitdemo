package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {

        List<String> list = new ArrayList<>();

        return "hello world";
    }

    public static void main(String[] args) {
        int a = 10;

        int b = 20;

        int c = a + b;

        System.out.println(c);

    }
}
