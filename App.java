package h.a.w;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Employee e1=new Employee();
       Employee e2=new Employee();
       
       e1.setEmp_id(11);
       e1.setEmp_name("Amar");
       
       e2.setEmp_id(12);
       e2.setEmp_name("Akbar");
       
       Project p1=new Project();
       Project p2=new Project();
       
       p1.setP_id(100);
       p1.setP_name("facebook");
       
       p2.setP_id(101);
       p2.setP_name("instagram");
       
       
       List<Employee> list1=new ArrayList<Employee>();
       List<Project> list2=new ArrayList<Project>();
       
       list1.add(e1);
       list1.add(e2);
       
       list2.add(p1);
       list2.add(p2);
       
       e1.setP(list2);
       p2.setE(list1);
       
       SessionFactory session =new Configuration().configure().buildSessionFactory();
		Session session2 =session.openSession();
		session2.beginTransaction();
		session2.save(e1);
		session2.save(e2);
		session2.save(p1);
		session2.save(p2);
		session2.getTransaction().commit();
             
    }
}
