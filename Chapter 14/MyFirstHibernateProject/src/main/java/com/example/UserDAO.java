package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAO {
    public void createUser(String name, String email) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            User user = new User(name, email);
            session.save(user);  // Hibernate generates and executes the INSERT SQL statement
            transaction.commit();
            System.out.println("User created: " + user);
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
