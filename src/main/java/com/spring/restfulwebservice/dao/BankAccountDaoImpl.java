package com.spring.restfulwebservice.dao;

import com.spring.restfulwebservice.model.BankAccount;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author : alif.razak@canang.com.my
 * @since : 5/18/2018 12:21 AM
 */
@Repository
public class BankAccountDaoImpl implements BankAccountDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public void save(BankAccount bankAccount) {
        em.persist(bankAccount);
    }
}
