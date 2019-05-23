package com.forum.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.forum.dao.StatusReplyDAO;
import com.forum.entity.StatusReply;
import com.sell.hibernateUI.HibernateUI;

public class StatusReplyImpl implements StatusReplyDAO {

	public void insert(StatusReply statusReply) {
		HibernateUI.insert(statusReply);
	}

	public void delete(StatusReply statusReply) {
		// TODO Auto-generated method stub
		HibernateUI.delete(statusReply);
	}

	public void update(StatusReply statusReply) {
		// TODO Auto-generated method stub

		HibernateUI.update(statusReply);
	}

	public StatusReply getStatusReply(int id) {
		Session session = HibernateUI.getSession();
		StatusReply statusReply = session.get(StatusReply.class, id);
		session.close();
		return statusReply;
	}

	@SuppressWarnings("unchecked")
	public List<StatusReply> getListStatusReply() {
		List<StatusReply> list = null;
		Session session = HibernateUI.getSession();
		list = session.createQuery("From " + StatusReply.class.getName()).getResultList();
		session.close();
		return list;
	}

}
