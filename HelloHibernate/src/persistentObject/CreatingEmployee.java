package persistentObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreatingEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("Tran");
		employee.setLastName("Nguyen");
		
		session.persist(employee);
		transaction.commit();
		
		session.close();
		
		
		System.out.println("Successfully Saved");
		
	}
}
