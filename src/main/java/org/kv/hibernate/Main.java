package org.kv.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by KV on 24/12/2016.
 */

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setStudent_name("KV");

		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setStudent_mobile_number("09xxxxx0009");
		studentDetail.setStudent(student);


		SessionFactory sessionFactory = new Configuration()
				.configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(studentDetail);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
