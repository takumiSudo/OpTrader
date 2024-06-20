package com.optrader.OpTrader.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to OpTrader;";
    }

    @GetMapping("/api")
    public String secure() {
        return "Welcome to Secure Platform;";
    }
}
