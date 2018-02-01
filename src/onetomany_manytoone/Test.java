package onetomany_manytoone;

import com.jogi.HibernateUtility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.ListIterator;

public class Test {

    public static void main(String[] args)
    {
        Transaction transaction=null;
        try(SessionFactory sessionFactory= HibernateUtility.getSessionFactory(); Session session=sessionFactory.openSession())
        {
             transaction=session.beginTransaction();
//             Instructor instructor=new Instructor("jogi","jogitemp@gmail.com");
//
//             Instructor instructor1=new Instructor("dheeraj","dheeraj13nd@gmail.com");
//
//             Instructor instructor2=new Instructor("alok","aloklada@gmail.com");
//
//             Instructor_Details instructor_details=new Instructor_Details("jogi"," specific");
//
//             Instructor_Details instructor_details1=new Instructor_Details("dheerajchannel","codding");
//
//             Instructor_Details instructor_details2=new Instructor_Details("alok lada","interview");
//
//             instructor.setInstructionDetails(instructor_details);
//             instructor1.setInstructionDetails(instructor_details1);
//             instructor2.setInstructionDetails(instructor_details2);


                // get instructor
//
//            Instructor instructor=session.get(Instructor.class,2);
//            Instructor instructor1=session.get(Instructor.class,1);
//
//            // show there course
//
//          List<Course> instruct2course= instructor.getCourses();
//          List<Course> instruct1course=instructor1.getCourses();
//
//          ListIterator<Course> listIterator=instruct1course.listIterator();
//          while (listIterator.hasNext())
//          {
//              Course course=listIterator.next();
//
//             System.out.println("course name is "+course.getTitle()+" instructor is "+course.getInstructor());
//          }
//
//          System.out.println("next");
//            ListIterator<Course> listIterator1=instruct2course.listIterator();
//            while (listIterator1.hasNext())
//            {
//                Course course=listIterator1.next();
//
//                System.out.println("course name is "+course.getTitle()+" instructor is "+course.getInstructor());
//            }
             //create course

//                Course course1=new Course("java");
//                Course course2=new Course(".net");
//                Course course3=new Course("sql");

             // add course to its instructor

//                instructor.add(course1);
//                instructor.add(course2);
//                instructor1.add(course3);
           // save persist,saveOrUpdate

//             session.save(instructor);
//             session.save(instructor1);
//             session.save(instructor2);


            // add review to course


            Course course=session.get(Course.class,1);

            course.addReview(new Review("great course"));
            course.addReview(new Review("good course"));

            session.save(course);

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
