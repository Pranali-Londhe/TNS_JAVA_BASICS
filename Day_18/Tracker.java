package com.supply.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tracker {

    public static void main(String[] args) {
        SpringApplication.run(Tracker.class, args);
    }

    @GetMapping("/supply")
    public String trackSupply(@RequestParam String item, @RequestParam int quantity) {
        return "Tracking Item: " + item + " | Total Quantity: " + quantity;
    }
}