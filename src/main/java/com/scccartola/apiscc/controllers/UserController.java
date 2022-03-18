package com.scccartola.apiscc.controllers;

import java.util.List;

import com.scccartola.apiscc.models.entities.PlayerUser;
import com.scccartola.apiscc.models.entities.User;
import com.scccartola.apiscc.services.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping (value = "/users")
public class UserController {
    
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<PlayerUser>> findAllusers(){
        return ResponseEntity.ok(userService.findAllUsers());
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<User> finduserById(@PathVariable Long id){
        return ResponseEntity.ok(userService.findUserById(id));
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody PlayerUser newUser){
        return ResponseEntity.ok(userService.createUser(newUser));
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody PlayerUser updateUser){
        return ResponseEntity.ok(userService.updateUser(id, updateUser));
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
