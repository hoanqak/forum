package com.forum.dao.impl;

import org.hibernate.Session;

import com.forum.dao.StatusPostDAO;
import com.forum.entity.StatusPost;
import com.sell.hibernateUI.HibernateUI;

public class StatusPostImpl implements StatusPostDAO{

	public void insert(StatusPost statusPost) {
		HibernateUI.insert(statusPost);
	}

	public void delete(StatusPost statusPost) {
		HibernateUI.delete(statusPost);
	}

	public void update(StatusPost statusPost) {
		// TODO Auto-generated method stub
		HibernateUI.update(statusPost);
	}

	public StatusPost getStatusPost(int id) {
		Session session = HibernateUI.getSession();
		StatusPost post = session.get(StatusPost.class, id);
		session.close();
		return post;
	}

}
