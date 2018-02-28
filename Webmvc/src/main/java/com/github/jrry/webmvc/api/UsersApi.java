package com.github.jrry.webmvc.api;

import com.github.jrry.webmvc.dto.User;
import com.github.jrry.webmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersApi {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    @ResponseBody
    public List<User> all() {
        return userService.getUsers();
    }
}
