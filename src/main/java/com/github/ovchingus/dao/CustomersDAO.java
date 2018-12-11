package com.github.ovchingus.dao;

import com.github.ovchingus.model.Customers;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomersDAO {
    public List<Customers> getCustomers() {
        Session session = HibernateUtil.openCurrentSessionWithTransaction();
        List<Customers> list = session.createQuery("from Customers").list();
        HibernateUtil.closeCurrentSessionWithTransaction();

        return list;
    }
}
