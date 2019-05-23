package com.forum.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Role role = session.get(Role.class, 1);
		System.out.println(role.getRole());
		session.beginTransaction().commit();
		session.close();
	}

}
