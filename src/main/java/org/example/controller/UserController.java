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
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        service.deleteById(id);
    }

    @GetMapping("/find-by-user-name/{userName}")
    public User findByUserName(@PathVariable String userName){
        return service.findByUserName(userName);
    }

    @GetMapping("/is-exist-user/{userName}")
    public Boolean isExistsUser(@PathVariable String userName){
        return service.isExistsUser(userName);
    }
}
