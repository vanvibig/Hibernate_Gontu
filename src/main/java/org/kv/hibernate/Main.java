package org.kv.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by KV on 24/12/2016.
 */

public class Main {

	public static void main(String[] args) throws Exception {

		StudentAddress studentAddress = new StudentAddress();
		studentAddress.setAddress_detail("Cantho, Vietnam");

		Student student1 = new Student();
		student1.setStudent_name("KV1");
		student1.setStudentAddress(studentAddress);

		Student student2 = new Student();
		student2.setStudent_name("KV2");
		student2.setStudentAddress(studentAddress);

		(studentAddress.getStudents()).add(student1);
		(studentAddress.getStudents()).add(student2);

		SessionFactory sessionFactory = new Configuration()
				.configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(studentAddress);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}
}
