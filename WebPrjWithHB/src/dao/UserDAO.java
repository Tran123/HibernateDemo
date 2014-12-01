package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import persistentObject.User;

public class UserDAO {

	public static int register(User user) {
		int i = 0;
		Session session = new Configuration().configure().buildSessionFactory()
				.openSession();

		Transaction trans = session.beginTransaction();
		trans.begin();

		i = (Integer) session.save(user);
		trans.commit();
		session.close();

		System.out.println("Save user successfully!!");
		return i;
	}
}
