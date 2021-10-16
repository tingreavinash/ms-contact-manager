package com.avinash.user.service;

import com.avinash.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final List<User> list = List.of(
            new User(1101L, "Avinash Tingre", "999"),
            new User(1103L, "Atul Tingre", "888"),
            new User(1104L, "Aaryant Tingre", "778")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
