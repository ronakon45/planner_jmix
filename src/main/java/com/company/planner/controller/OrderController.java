package com.company.planner.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/calculateTotalAmount")
    public ResponseEntity<String> calculateTotalAmount(
            @RequestParam int orderId
    ) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .header(HttpHeaders.CACHE_CONTROL, "max-age=31536000")
                .body("You just put : " + String.valueOf(orderId));

    }

    @GetMapping("/test")
    public String test(){
        return "test ";
    }

}