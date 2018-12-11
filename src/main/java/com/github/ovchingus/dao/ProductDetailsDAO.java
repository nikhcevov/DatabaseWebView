package com.github.ovchingus.dao;

import com.github.ovchingus.model.ProductDetails;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDetailsDAO {
    public List<ProductDetails> getProductDetails() {
        Session session = HibernateUtil.openCurrentSessionWithTransaction();
        List<ProductDetails> list = session.createQuery("from ProductDetails").list();
        HibernateUtil.closeCurrentSessionWithTransaction();

        return list;
    }
}
