package com.spring.restfulwebservice.user.controller;

import com.spring.restfulwebservice.user.domain.model.Customer;
import com.spring.restfulwebservice.user.domain.model.CustomerImpl;
import com.spring.restfulwebservice.user.service.CustomerDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerDaoService service;

    @PostMapping(path = "/user/name/{name}/contact/{contact}")
    public void saveCustomer(@PathVariable String name, @PathVariable String contact){
        Customer customer= new CustomerImpl();
        customer.setContact(contact);
        customer.setName(name);
        service.SaveCustomer(customer);
    }

    @GetMapping(path = "/users")
    public List<Customer> findCustomers(){
        return service.findCustomers();
    }


    @GetMapping(path = "/user/{id}")
    public Customer findCustomer(@PathVariable long id){
       return service.findSpecificCustomer(id);
    }

}
