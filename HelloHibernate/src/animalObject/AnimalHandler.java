package animalObject;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AnimalHandler {

	public static void main(String[] args){
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Transaction trans = session.beginTransaction();
		
		Animal animal = new Animal();
		animal.setName("Animal Father");
		
		Dog dog = new Dog();
		dog.setName("Puppy");
		
		Bird bird = new Bird();
		bird.setName("Bird");
		
		session.persist(animal);
		session.persist(dog);
		session.persist(bird);
		
		trans.commit();
		session.close();
		System.out.println("Create Animal Success!!");
	}
	
	
}
