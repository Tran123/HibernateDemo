package persistentObject;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class CreatingEmployer {
	
	public static void main(String[] args){
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();
		
		Employer employer1 = new Employer();
		employer1.setId(3);
		employer1.setName("Hung Dang");
		
		Employer employer2 = new Employer();
		employer2.setId(4);
		employer2.setName("Bambi Nguyen");
		
		session.persist(employer1);
		session.persist(employer2);
		
		t.commit();
		session.close();
		
		System.out.println("Save employer " + employer1.getName() + ", and employer: " + employer2.getName() + " successful!!");
	}

}
