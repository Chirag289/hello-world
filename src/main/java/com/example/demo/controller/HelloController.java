package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/add")
    public Integer add(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + num2;
    }

    @GetMapping("/subtract")
    public Integer subtract(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 - num2;
    }

    @GetMapping("/multiply")
    public Integer multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 * num2;
    }

    @GetMapping("/divide")
    public Integer divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 / num2;
    }

}