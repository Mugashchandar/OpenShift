package com.example.opeshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Mugash
 * Date: 04-05-2025
 * Time: 12:16
 */
@RestController
public class OpenShiftController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Mugashchandar and Akshymathi!";
    }

}
