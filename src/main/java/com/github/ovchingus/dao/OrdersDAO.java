package com.github.ovchingus.dao;

import com.github.ovchingus.model.Orders;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrdersDAO {
    public List<Orders> getOrders() {
        Session session = HibernateUtil.openCurrentSessionWithTransaction();
        List<Orders> list = session.createQuery("from Orders").list();
        HibernateUtil.closeCurrentSessionWithTransaction();

        return list;
    }
}
