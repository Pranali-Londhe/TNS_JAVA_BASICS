package com.SpringApplication.Spring_Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddController {

    @GetMapping("/check")
    public String checkEvenOdd(@RequestParam int number) {
        if (number % 2 == 0) {
            return number + " is Even!";
        } else {
            return number + " is Odd!";
        }
    }
}