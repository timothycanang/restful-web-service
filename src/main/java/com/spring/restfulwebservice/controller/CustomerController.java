package com.spring.restfulwebservice.controller;

import com.spring.restfulwebservice.dao.CustomerDao;
import com.spring.restfulwebservice.model.BankAccount;
import com.spring.restfulwebservice.model.BankAccountImpl;
import com.spring.restfulwebservice.model.Customer;
import com.spring.restfulwebservice.model.CustomerImpl;
import com.spring.restfulwebservice.service.BankAccountService;
import com.spring.restfulwebservice.vo.BankAccountVo;
import com.spring.restfulwebservice.vo.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerDao customerDao;

    @Autowired
    BankAccountService bankAccountService;

    @PostMapping(path = "/customers")
    public void saveCustomer(@RequestBody CustomerVo customerVo) {
        Customer customer = new CustomerImpl();
        customer.setContact(customerVo.getContact());
        customer.setName(customerVo.getName());
        customerDao.saveCustomer(customer);
    }

    @GetMapping(path = "/customers")
    public List<Customer> findCustomers() {
        return customerDao.findCustomers();
    }

    @GetMapping(path = "/customers/{id}")
    public Customer findCustomer(@PathVariable long id) {
        return customerDao.findCustomerById(id);
    }

    @PostMapping(path = "/customer/{id}/bank_accounts")
    public void addBankAccount(@PathVariable Long id, @RequestBody BankAccountVo bankAccountVo) {
        Customer customer = customerDao.findCustomerById(id);
        BankAccount bankAccount = new BankAccountImpl();
        bankAccount.setAccountNo(bankAccountVo.getAccountNo());
        bankAccount.setCustomer(customer);
        bankAccountService.saveBankAccount(bankAccount);
    }

    @GetMapping(path = "/customer/{id}/bank_accounts")
    public List<BankAccountVo> getBankAccounts(@PathVariable Long id) {
        Customer customer = customerDao.findCustomerById(id);
        List<BankAccountVo> vos = new ArrayList<>();
        List<BankAccount> accounts = customer.getBankAccounts();
        for (BankAccount account : accounts) {
            vos.add(new BankAccountVo(account.getAccountNo()));
        }
        return vos;
    }
}
