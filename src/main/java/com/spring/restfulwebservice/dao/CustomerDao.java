package com.spring.restfulwebservice.dao;

import com.spring.restfulwebservice.model.BankAccount;
import com.spring.restfulwebservice.model.Customer;

import java.util.List;

public interface CustomerDao {

    void saveCustomer(Customer c);

    List<Customer> findCustomers();

    Customer findCustomerById(long id);

    void addBankAccount(Customer customer, BankAccount bankAccount);
}
