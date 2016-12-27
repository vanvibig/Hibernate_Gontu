package org.kv.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by KV on 24/12/2016.
 */

public class Main {

	public static void main(String[] args) throws Exception {

		StudentCertification sc1 = new StudentCertification();
		sc1.setCertification_name("Core Java Certificate Exam");

		StudentCertification sc2 = new StudentCertification();
		sc2.setCertification_name("Oracle DB Certificate Exam");

		Student student1 = new Student();
		student1.setStudent_name("KV1");
		(student1.getStudentCertifications()).add(sc1);

		Student student2 = new Student();
		student2.setStudent_name("KV2");
		(student2.getStudentCertifications()).add(sc2);

		SessionFactory sessionFactory = new Configuration()
				.configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(student1);
		session.save(student2);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}
}
