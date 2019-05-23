package com.sell.hibernateUI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUI {

	private static SessionFactory sessionFactory;
	private static Session session;
	public static SessionFactory getSessionFactory() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		return sessionFactory;
	}
	
	public static Session getSession() {
		session = getSessionFactory().openSession();
		return session;
	}
	
}
