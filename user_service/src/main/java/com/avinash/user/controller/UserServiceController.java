package com.avinash.user.controller;

import com.avinash.user.entity.Contact;
import com.avinash.user.entity.User;
import com.avinash.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserServiceController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {
        User user = this.userService.getUser(userId);

        //http://localhost:9002/contact/user/1101
        List<Contact> contacts = new ArrayList<>();

        try{
            contacts = this.restTemplate.getForObject("http://contact-service/contact/user/" + user.getUserId(),
                    List.class);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        user.setContacts(contacts);
        return user;
    }
}
