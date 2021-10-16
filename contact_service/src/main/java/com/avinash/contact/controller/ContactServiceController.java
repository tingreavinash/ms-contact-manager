package com.avinash.contact.controller;

import com.avinash.contact.entity.Contact;
import com.avinash.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactServiceController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/user/{userId}")
    public List<Contact> getContactsOfUser(@PathVariable("userId") Long userId){
        return this.contactService.getContactsOfUser(userId);
    }

}
