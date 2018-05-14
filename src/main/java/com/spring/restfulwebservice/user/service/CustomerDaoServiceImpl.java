package com.spring.restfulwebservice.user.service;

import com.spring.restfulwebservice.user.domain.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Repository
@Transactional
public class CustomerDaoServiceImpl implements CustomerDaoService {


    @PersistenceContext
    private EntityManager em;
    private EntityManagerFactory factory = null;
    private EntityTransaction tx = null;

    public CustomerDaoServiceImpl(){
        factory = Persistence
                .createEntityManagerFactory("infinite-finances");
        em = factory.createEntityManager();
        tx = em.getTransaction();
    }


    @Override
    public void SaveCustomer(Customer c) {

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
    public Customer findSpecificCustomer(long id) {

        try {
            Query q = em.createQuery("SELECT t from CustomerImpl t  WHERE t.id ="+id);
           return (Customer) q.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
