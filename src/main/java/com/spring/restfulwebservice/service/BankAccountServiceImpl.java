package com.spring.restfulwebservice.service;

import com.spring.restfulwebservice.dao.BankAccountDao;
import com.spring.restfulwebservice.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : alif.razak@canang.com.my
 * @since : 5/18/2018 12:22 AM
 */
@Service
@Transactional
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    BankAccountDao bankAccountDao;

    @Override
    public void saveBankAccount(BankAccount bankAccount) {
        bankAccountDao.save(bankAccount);
    }
}
