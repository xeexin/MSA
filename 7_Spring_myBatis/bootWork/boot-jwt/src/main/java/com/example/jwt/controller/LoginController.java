
package com.example.jwt.controller;

import com.example.jwt.model.AuthRequest;
import com.example.jwt.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login") // https://localhost8081/auth/loing
    public ResponseEntity<String> login(@RequestBody AuthRequest request) {
        String token = userService.login(request.getUsername(), request.getPassword());
        return ResponseEntity.ok(token);
    }
}
