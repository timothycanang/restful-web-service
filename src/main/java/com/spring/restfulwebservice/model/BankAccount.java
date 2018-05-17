package com.spring.restfulwebservice.model;

/**
 * @author : alif.razak@canang.com.my
 * @since : 5/17/2018 11:47 PM
 */
public interface BankAccount {

    Long getId();

    void setId(Long id);

    String getAccountNo();

    void setAccountNo(String accountNo);

    Customer getCustomer();

    void setCustomer(Customer customer);
}
