package org.example;

import org.example.pojo.Category;
import org.example.service.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            session.beginTransaction();

            Category category = new Category(
                    "DEPTRAI",
                    "Computer description"
            );
            session.persist(category);

            session.getTransaction().commit();
            category.setName("DEPTRAI UPDATED");

            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}