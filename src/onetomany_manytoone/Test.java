package onetomany_manytoone;

import com.jogi.HibernateUtility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {

    public static void main(String[] args)
    {
        Transaction transaction=null;
        try(SessionFactory sessionFactory= HibernateUtility.getSessionFactory(); Session session=sessionFactory.openSession())
        {
             transaction=session.beginTransaction();
             Instructor instructor=new Instructor("jogi","jogitemp@gmail.com");

             Instructor instructor1=new Instructor("dheeraj","dheeraj13nd@gmail.com");

             Instructor instructor2=new Instructor("alok","aloklada@gmail.com");

             Instructor_Details instructor_details=new Instructor_Details("jogi"," specific");

             Instructor_Details instructor_details1=new Instructor_Details("dheerajchannel","codding");

             Instructor_Details instructor_details2=new Instructor_Details("alok lada","interview");

             instructor.setInstructionDetails(instructor_details);
             instructor1.setInstructionDetails(instructor_details1);
             instructor2.setInstructionDetails(instructor_details2);


                // get instructor

           // Instructor instructor=session.get(Instructor.class,2);
           // Instructor instructor1=session.get(Instructor.class,1);
             //create course

                Course course1=new Course("java");
                Course course2=new Course(".net");
                Course course3=new Course("sql");

             // add course to its instructor

                instructor.add(course1);
                instructor.add(course2);
                instructor1.add(course3);
           // save persist,saveOrUpdate

             session.save(instructor);
             session.save(instructor1);
             session.save(instructor2);
             session.flush();
            transaction.commit();
        }
        catch (Exception e)
        {
            //transaction.rollback();
            e.printStackTrace();
        }
    }
}
