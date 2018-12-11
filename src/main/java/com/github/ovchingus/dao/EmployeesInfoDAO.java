package com.github.ovchingus.dao;

import com.github.ovchingus.model.EmployeesInfo;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeesInfoDAO {

    public List<EmployeesInfo> getEmployeesInfo() {
        Session session = HibernateUtil.openCurrentSessionWithTransaction();
        List<EmployeesInfo> list = session.createQuery("from EmployeesInfo").list();
        HibernateUtil.closeCurrentSessionWithTransaction();

        return list;
    }
}
