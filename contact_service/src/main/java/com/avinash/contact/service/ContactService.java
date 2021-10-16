package com.avinash.contact.service;

import com.avinash.contact.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);
}
