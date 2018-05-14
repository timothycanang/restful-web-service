package com.spring.restfulwebservice.user.domain.model;


import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class CustomerImpl implements Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private long id;

    @Column(name = "customer_name")
    private String name;

    @Column(name="customer_contact")
    private String contact;


    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String getContact() {
        return this.contact;
    }
}
