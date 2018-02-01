package onetooneuni;

import com.jogi.HibernateUtility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args)
    {
        SessionFactory sessionFactory= HibernateUtility.getSessionFactory();
        Transaction transaction=null;
        try( Session session=sessionFactory.openSession()) {

            transaction=session.beginTransaction();

            Instructor instructor=new Instructor("jogi","jogitemp@gmail.com");

            Instructor instructor1=new Instructor("dheeraj","dheeraj13nd@gmail.com");

            Instructor instructor2=new Instructor("alok","aloklada@gmail.com");

            Instructor_Details instructor_details=new Instructor_Details(
                    "jogi"," specific"
            );

           // Instructor_Details instructor_details1=new Instructor_Details("dheerajchannel","codding");

           // Instructor_Details instructor_details2=new Instructor_Details("alok lada","interview");

           // instructor.setInstructionDetails(instructor_details);
           // instructor1.setInstructionDetails(instructor_details1);
            //instructor2.setInstructionDetails(instructor_details2);
           // instructor2.setInstructionDetails(instructor_details2);
            //save persist,saveOrUpdate

           // session.save(instructor);
           // session.save(instructor1);
           // session.save(instructor2);

           // session.flush();



            Instructor_Details obj=session.get(Instructor_Details.class,1);
            Instructor ins=obj.getInstructor();


            System.out.println(ins);
            System.out.println(obj);
            transaction.commit();

        }
        catch (Exception e)
        {
            transaction.rollback();
        }
    }
}
