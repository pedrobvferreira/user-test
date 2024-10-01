package com.user.usertest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.user.usertest.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    private ResponseEntity<?> getUserById(@PathVariable("id") Long id) {
		var user = userService.getUserById(id);
		return ResponseEntity.status(HttpStatus.OK).body(user);
    }
    
}
