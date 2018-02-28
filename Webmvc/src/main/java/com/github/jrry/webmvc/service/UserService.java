package com.github.jrry.webmvc.service;

import com.github.jrry.webmvc.dto.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users;

    public UserService() {
        users = new ArrayList<>();
        users.add(new User("Jan", "Kowalski", 20));
        users.add(new User("Adam", "Nowak", 30));
        users.add(new User("Ędward", "Ącki", 30));
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
