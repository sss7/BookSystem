package com.BS.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSingleton {
    private static SessionFactory sessionFactory = null;

    public static synchronized SessionFactory getInstance() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration().configure().buildSessionFactory();
            } catch (Throwable e) {
                System.out.println("Initial session failed" + e);
                throw new ExceptionInInitializerError(e);
            }
        }
        return sessionFactory;
    }

}
