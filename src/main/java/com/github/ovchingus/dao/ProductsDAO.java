package com.github.ovchingus.dao;

import com.github.ovchingus.model.Products;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductsDAO {
    public List<Products> getProducts() {
        Session session = HibernateUtil.openCurrentSessionWithTransaction();
        List<Products> list = session.createQuery("from Products").list();
        HibernateUtil.closeCurrentSessionWithTransaction();

        return list;
    }
}
