package com.github.ovchingus.dao;

import com.github.ovchingus.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static Session currentSession;

    private static Transaction currentTransaction;

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Employees.class);
        configuration.addAnnotatedClass(EmployeesInfo.class);
        configuration.addAnnotatedClass(Customers.class);
        configuration.addAnnotatedClass(OrderDetails.class);
        configuration.addAnnotatedClass(Orders.class);
        configuration.addAnnotatedClass(ProductDetails.class);
        configuration.addAnnotatedClass(Products.class);
        configuration.addAnnotatedClass(Stocks.class);
        configuration.addAnnotatedClass(IncomePerMonthView.class);

        configuration.configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        return configuration.buildSessionFactory(builder.build());
    }

    static Session openCurrentSessionWithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    static void closeCurrentSessionWithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }
}
