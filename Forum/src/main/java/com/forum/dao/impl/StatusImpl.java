package com.forum.dao.impl;

import org.hibernate.Session;
import org.hibernate.dialect.identity.H2IdentityColumnSupport;

import com.forum.dao.StatusDAO;
import com.forum.entity.Status;
import com.sell.hibernateUI.HibernateUI;

public class StatusImpl implements StatusDAO{

	public void insert(Status status) {
		HibernateUI.insert(status);
	}

	public void delete(Status status) {
		// TODO Auto-generated method stub
		HibernateUI.delete(status);
	}

	public void update(Status status) {
		// TODO Auto-generated method stub
		HibernateUI.update(status);
	}

	public Status getStatus(int id) {
		Session session = HibernateUI.getSession();
		Status status = session.get(Status.class, id);
		session.close();
		return status;
	}

}
