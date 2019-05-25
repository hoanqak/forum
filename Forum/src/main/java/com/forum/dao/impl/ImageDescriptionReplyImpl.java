package com.forum.dao.impl;

import org.hibernate.Session;

import com.forum.dao.ImageDescriptionReplyDAO;
import com.forum.entity.ImageDescriptionReply;
import com.sell.hibernateUI.HibernateUI;

public class ImageDescriptionReplyImpl implements ImageDescriptionReplyDAO{

	public void insert(ImageDescriptionReply imageDescriptionReply) {
		Session session = HibernateUI.getSession();
		try {
			session.save(imageDescriptionReply);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
		}finally {
			session.close();
		}
	}

	public void delete(ImageDescriptionReply imageDescriptionReply) {
		Session session = HibernateUI.getSession();
		try {
			session.delete(imageDescriptionReply);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
		}finally {
			session.close();
		}
	}

	public void update(ImageDescriptionReply imageDescriptionReply) {
		Session session = HibernateUI.getSession();
		try {
			session.update(imageDescriptionReply);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
		}finally {
			session.close();
		}
	}
	
	public ImageDescriptionReply getImageDescriptionReply(int id) {
		Session session = HibernateUI.getSession();
		ImageDescriptionReply imageDescriptionReply = session.get(ImageDescriptionReply.class, id);
		session.close();
		
		return imageDescriptionReply;
	}

}
