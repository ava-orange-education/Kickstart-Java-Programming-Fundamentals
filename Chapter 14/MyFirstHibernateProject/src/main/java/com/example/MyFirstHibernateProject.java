package com.example;

import org.hibernate.Session;

public class MyFirstHibernateProject {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Hibernate is configured correctly!");
        session.close();
    }
}