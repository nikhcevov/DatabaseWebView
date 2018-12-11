package com.github.ovchingus.dao;

import com.github.ovchingus.model.Employees;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeesDAO {

    public List<Employees> getEmployees() {
        Session session = HibernateUtil.openCurrentSessionWithTransaction();
        List<Employees> list = session.createQuery("from Employees").list();
        HibernateUtil.closeCurrentSessionWithTransaction();

        return list;
    }
}
