package com.github.ovchingus.dao;

import com.github.ovchingus.model.IncomePerMonthView;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IncomePerMonthViewDAO {

    public List<IncomePerMonthView> getIncomePerMonthView() {
        Session session = HibernateUtil.openCurrentSessionWithTransaction();
        List<IncomePerMonthView> list = session.createQuery("from IncomePerMonthView").list();
        HibernateUtil.closeCurrentSessionWithTransaction();

        return list;
    }
}
