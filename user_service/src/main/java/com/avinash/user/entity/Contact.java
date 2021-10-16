package com.avinash.user.entity;

public class Contact {
    private Long cId;
    private Long userId;
    private String contactName;
    private String email;

    public Contact() {
    }

    public Contact(Long cId, Long userId, String contactName, String email) {
        this.cId = cId;
        this.userId = userId;
        this.contactName = contactName;
        this.email = email;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
