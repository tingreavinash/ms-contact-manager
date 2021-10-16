package com.avinash.contact.service;

import com.avinash.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = List.of(
            new Contact(101L, 1101L, "roshan", "roshan@gmail.com" ),
            new Contact(102L, 1101L, "tushar", "tushar@gmail.com" ),
            new Contact(103L, 1103L, "mayur", "mayur@gmail.com" ),
            new Contact(104L, 1104L, "sushant", "sushant@gmail.com" )
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
