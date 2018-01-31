package com.jogi.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
    
    public static void main(String[] args)
    {
       SessionFactory sessionFactory= HibernateUtility.getSessionFactory();
        Session session=null;
        try{
            session=sessionFactory.openSession();
            Transaction transaction=session.beginTransaction();
            Student student=new Student("jogendra","9950362283");
            session.save(student);
            transaction.commit();
        }catch (Exception e)
        {
            session.close();
        }
    }
}
