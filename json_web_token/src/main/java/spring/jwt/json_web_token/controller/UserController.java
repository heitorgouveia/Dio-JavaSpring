package spring.jwt.json_web_token.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.jwt.json_web_token.model.User;
import spring.jwt.json_web_token.security.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private UserService service;
    @PostMapping
        public void postUser(@RequestBody User user){
            service.createUser(user);
    }
    

}
