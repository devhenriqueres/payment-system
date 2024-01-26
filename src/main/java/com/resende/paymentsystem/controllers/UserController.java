package com.resende.paymentsystem.controllers;

import com.resende.paymentsystem.DTO.UserRequest;
import com.resende.paymentsystem.entity.User;
import com.resende.paymentsystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody UserRequest userRequest){
        User user = userRequest.toModel();
        User userSaved = userService.registerUser(user);

        return  ResponseEntity.ok().body(userSaved);
    }
}
