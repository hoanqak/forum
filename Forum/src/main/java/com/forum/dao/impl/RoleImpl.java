package com.forum.dao.impl;

import org.hibernate.Session;
import org.hibernate.dialect.identity.H2IdentityColumnSupport;

import com.forum.dao.RoleDAO;
import com.forum.entity.Role;
import com.sell.hibernateUI.HibernateUI;

public class RoleImpl implements RoleDAO{

	public void insert(Role role) {
		Session session = HibernateUI.getSession();
		try {
			session.save(role);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
		}
	}

	public void delete(Role role) {
		Session session = HibernateUI.getSession();
		try {
			session.delete(role);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
		}
	}

	public void update(Role role) {
		Session session = HibernateUI.getSession();
		try {
			session.update(role);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
		}
	}

	public Role getRole(int id) {
		Session session = HibernateUI.getSession();
		Role role = session.get(Role.class, id);
		session.close();
		return role;
	}

}
