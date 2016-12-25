package org.kv.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;


/**
 * Created by KV on 24/12/2016.
 */

public class Main {

	public static void main(String[] args) {

		StudentInfo student = new StudentInfo();
		student.setName("KV1");
		student.setBirthDate(new Date());

		StudentInfo student2 = new StudentInfo();
		student2.setName("KV2");
		student2.setBirthDate(new Date());

		SessionFactory sessionFactory = new Configuration()
				.configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(student);
		session.save(student2);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
