package com.khewang.springSecurity.Controller;

import com.khewang.springSecurity.Model.Users;
import com.khewang.springSecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService Service;
    @PostMapping("/register")
    public Users register(@RequestBody Users user) {

        return Service.register(user);
    }
}
