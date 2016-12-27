package org.kv.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by KV on 24/12/2016.
 */

public class Main {

	public static void main(String[] args) throws Exception {

		Student student = new Student();
		student.setStudent_name("KV");

		SessionFactory sessionFactory = new Configuration()
				.configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		student = (Student) session.get(Student.class, 1);
		System.out.println("Student Object having student name as: " + student.getStudent_name());

		student.setStudent_name("KV2");
		session.delete(student);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}
}
