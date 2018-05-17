package com.spring.restfulwebservice.dao;

import com.spring.restfulwebservice.model.BankAccount;
import com.spring.restfulwebservice.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {

    @PersistenceContext
    private EntityManager em;

    public CustomerDaoImpl() {
    }


    @Override
    public void saveCustomer(Customer c) {
        try {
            em.persist(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> findCustomers() {
        try {
            Query q = em.createQuery("FROM CustomerImpl");
            return q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Customer findCustomerById(long id) {

        try {
            Query q = em.createQuery("SELECT t from CustomerImpl t  WHERE t.id =" + id);
            return (Customer) q.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addBankAccount(Customer customer, BankAccount bankAccount) {
        bankAccount.setCustomer(customer);
        em.persist(customer);
    }
}
