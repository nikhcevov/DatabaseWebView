package com.github.ovchingus.dao;

import com.github.ovchingus.model.Stocks;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StocksDAO {
    public List<Stocks> getStocks() {
        Session session = HibernateUtil.openCurrentSessionWithTransaction();
        List<Stocks> list = session.createQuery("from Stocks").list();
        HibernateUtil.closeCurrentSessionWithTransaction();

        return list;
    }
}
