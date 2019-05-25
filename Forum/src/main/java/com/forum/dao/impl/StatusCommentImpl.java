package com.forum.dao.impl;

import org.hibernate.Session;
import org.hibernate.dialect.identity.H2IdentityColumnSupport;

import com.forum.dao.StatusCategoryDAO;
import com.forum.entity.StatusCategory;
import com.sell.hibernateUI.HibernateUI;

public class StatusCommentImpl implements StatusCategoryDAO{

	public void insert(StatusCategory statusCategory) {
		HibernateUI.insert(statusCategory);
	}

	public void delete(StatusCategory statusCategory) {
		// TODO Auto-generated method stub
		HibernateUI.delete(statusCategory);
	}

	public void update(StatusCategory statusCategory) {
		// TODO Auto-generated method stub
		HibernateUI.update(statusCategory);
		
	}

	public StatusCategory getStatusCategory(int id) {
		Session session = HibernateUI.getSession();
		StatusCategory category =session.get(StatusCategory.class, id);
		session.close();
		return category;
	}

}
