package com.spring.restfulwebservice.model;

import javax.persistence.*;

@Entity(name = "bankAccount")
@Table(name = "BANK_ACCT")
public class BankAccountImpl implements BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    Long id;

    @Column(name = "ACCOUNT_NO", unique = true)
    private
    String accountNo;

    @JoinColumn(name = "CUSTOMER_ID")
    @ManyToOne(targetEntity = CustomerImpl.class, fetch = FetchType.LAZY)
    private Customer customer;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getAccountNo() {
        return accountNo;
    }

    @Override
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
