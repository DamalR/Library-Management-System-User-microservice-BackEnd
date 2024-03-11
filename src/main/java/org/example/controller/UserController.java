package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    final UserService service;

    @GetMapping("/get-all-users")
    public List<UserEntity> getAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping("/add-user")
    void addUser(@RequestBody User user) {
        service.addUser(user);

    }
}
