package com.forum.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.getCurrentSession();

		Account account = new Account("admin", "123");
		session.save(account);
		session.beginTransaction().commit();

		System.out.println(session.isConnected());
		session.close();
	}

}
