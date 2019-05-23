package com.forum.dao.impl;

import org.hibernate.Session;

import com.forum.dao.ImageDescriptionCommentDAO;
import com.forum.entity.ImageDescriptionComment;
import com.sell.hibernateUI.HibernateUI;

public class ImageDescriptionCommentImpl implements ImageDescriptionCommentDAO{

	public void insert(ImageDescriptionComment descriptionComment) {
		Session session =HibernateUI.getSession();
		try {
			session.save(descriptionComment);
			session.beginTransaction().commit();
		}catch (Exception e) {
			session.beginTransaction().rollback();
		}
		finally {
			session.close();
		}
	}

	public void update(ImageDescriptionComment descriptionComment) {
		Session session =HibernateUI.getSession();
		try {
			session.update(descriptionComment);
			session.beginTransaction().commit();
		}catch (Exception e) {
			session.beginTransaction().rollback();
		}
		finally {
			session.close();
		}
	}

	public void delete(ImageDescriptionComment descriptionComment) {
		Session session =HibernateUI.getSession();
		try {
			session.delete(descriptionComment);
			session.beginTransaction().commit();
		}catch (Exception e) {
			session.beginTransaction().rollback();
		}
		finally {
			session.close();
		}
	}

	public ImageDescriptionComment getImageDescriptionComment(int id) {
		Session session = HibernateUI.getSession();
		ImageDescriptionComment comment = session.get(ImageDescriptionComment.class, id);
		session.close();
		return comment;
	}

}
