package org.kv.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by KV on 24/12/2016.
 */

public class Main {

	public static void main(String[] args) {

		Student_Info student = new Student_Info();
		student.setRollNo(1);
		student.setName("KV");

		SessionFactory sessionFactory = new Configuration()
				.configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(student);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
