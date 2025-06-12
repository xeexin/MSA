
package com.example.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    @PreAuthorize("hasRole('USER')")
    public String hello() {
        return "Hello, authenticated user!";
    }
}
