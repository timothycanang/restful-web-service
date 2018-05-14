package com.spring.restfulwebservice.user.domain.model;

public interface Customer {

    void setId(long id);
    long getId();
    void setName(String name);
    String getName();
    void setContact(String contact);
    String getContact();
}
