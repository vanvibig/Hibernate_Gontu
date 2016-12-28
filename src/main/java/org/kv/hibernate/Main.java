package org.kv.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by KV on 24/12/2016.
 */

public class Main {

	public static void main(String[] args) throws Exception {

		Student student = null;

		SessionFactory sessionFactory = new Configuration()
				.configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		student = (Student) session.get(Student.class, 1);
		System.out.println("Student object retrieved: name = "
				+ student.getStudent_name());

		session.getTransaction().commit();
		session.close();

		student.setStudent_name("KV in detatch state");

		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();

		session2.update(student);
		session2.getTransaction().commit();
		session2.close();

		sessionFactory.close();


	}
}
