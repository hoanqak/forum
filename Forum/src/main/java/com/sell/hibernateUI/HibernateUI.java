package com.sell.hibernateUI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUI {

	private static SessionFactory sessionFactory;
	private static Session session;

	public static SessionFactory getSessionFactory() {
		sessionFactory = new Configuration().configure("Hibernate/hibernate.cfg.xml").buildSessionFactory();
		return sessionFactory;
	}

	public static Session getSession() {
		session = getSessionFactory().openSession();
		return session;
	}

	public static void insert(Object object) {
		Session session = getSession();
		try {
			session.save(object);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		} finally {
			session.close();
		}
	}

	public static void delete(Object object) {
		Session session = getSession();
		try {
			session.delete(object);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		} finally {
			session.close();
		}
	}

	public static void update(Object object) {
		Session session = getSession();
		try {
			session.update(object);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		} finally {
			session.close();
		}
	}
	
	public static Object getObject(Object object, int id) {
		Session session = getSession();
		object = session.get(object.getClass(), id);
		session.close();
		return object;
	}
}
