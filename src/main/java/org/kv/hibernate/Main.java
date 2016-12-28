package org.kv.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by KV on 24/12/2016.
 */

public class Main {

	public static void main(String[] args) throws Exception {

		SessionFactory sessionFactory = new Configuration()
				.configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Student student = (Student) session.get(Student.class, 1);
		System.out.println("Student object retrieved: name = "
				+ student.getStudent_name());

		student.setStudent_name("KV id = 1");

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}
}
