package com.itss.restapi.controllers;

import com.itss.restapi.entities.User;
import com.itss.restapi.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/user/getall")
  public List<User> getUsers() {
    return userService.getUsers();
  }

  @GetMapping("/user/get")
  public User getUser(String useCpf) {
    return userService.getUser(useCpf);
  }

  @PostMapping("/user/add")
  public User saveUser(@RequestBody User user) {
    return userService.saveUser(user);
  }

  @PostMapping("/user/auth")
  public ResponseEntity<Boolean> authUser(
    @RequestParam String login,
    @RequestParam String password
  ) {
    return userService.authUser(login, password);
  }
}
