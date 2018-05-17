package com.spring.restfulwebservice.model;

import java.util.List;

public interface Customer {

    void setId(long id);

    long getId();

    void setName(String name);

    String getName();

    void setContact(String contact);

    String getContact();

    List<BankAccount> getBankAccounts();
}
