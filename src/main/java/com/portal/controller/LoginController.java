package com.portal.controller;

import com.portal.model.User;
import com.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Mehmet Ali Sahinogullari on 27.08.2017.
 */

@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        User newUser = userService.login(user);
        String welcome = "Welcome to University Portal!!";
        return new ResponseEntity<User>(newUser, HttpStatus.OK);
    }

    @RequestMapping()
    public ResponseEntity<String> welcome() {
        return new ResponseEntity<String>("<center><h1>Welcome to University Portal!!</h1></center>", HttpStatus.OK);
    }


}
