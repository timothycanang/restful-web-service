package com.spring.restfulwebservice.user.service;

import com.spring.restfulwebservice.user.domain.model.Customer;

import java.util.List;

public interface CustomerDaoService {

    void SaveCustomer(Customer c);
    List<Customer> findCustomers();
    Customer findSpecificCustomer(long id);
}
