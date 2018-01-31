package com.jogi.bidirection;

import com.jogi.HibernateUtility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args)
    {
        try(SessionFactory sessionFactory= HibernateUtility.getSessionFactory(); Session session=sessionFactory.openSession())
        {
            Transaction transaction=session.beginTransaction();

            Student student=new Student("jogi","9950362283");
            Course course=new Course("java","6 month");
            course.setStudent(student);
            session.save(course);
        }
    }
}
