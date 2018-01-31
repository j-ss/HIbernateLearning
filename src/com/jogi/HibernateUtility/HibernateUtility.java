package com.jogi.java;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {

    private static SessionFactory sessionFactory=null;

    public static SessionFactory getSessionFactory()
    {
        if(sessionFactory==null)
            createSessionFactory();

        return sessionFactory;
    }

    private static void createSessionFactory()
    {
        Configuration configuration=new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Course.class);
        sessionFactory=configuration.buildSessionFactory();


    }
}
