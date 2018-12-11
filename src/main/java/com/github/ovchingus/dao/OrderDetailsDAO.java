package com.github.ovchingus.dao;

import com.github.ovchingus.model.OrderDetails;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDetailsDAO {
    public List<OrderDetails> getOrderDetails() {
        Session session = HibernateUtil.openCurrentSessionWithTransaction();
        List<OrderDetails> list = session.createQuery("from OrderDetails").list();
        HibernateUtil.closeCurrentSessionWithTransaction();

        return list;
    }
}
