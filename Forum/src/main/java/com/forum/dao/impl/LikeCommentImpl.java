package com.forum.dao.impl;

import org.hibernate.Session;

import com.forum.dao.LikeCommentDAO;
import com.forum.entity.LikeComment;
import com.sell.hibernateUI.HibernateUI;

public class LikeCommentImpl implements LikeCommentDAO{

	public void insert(LikeComment likeComment) {
		Session session = HibernateUI.getSession();
		try {
			session.save(likeComment);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
		}
	}

	public void delete(LikeComment likeComment) {
		Session session = HibernateUI.getSession();
		try {
			session.delete(likeComment);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
		}
	}

	public void update(LikeComment likeComment) {
		Session session = HibernateUI.getSession();
		try {
			session.update(likeComment);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
		}
	}

	public LikeComment getLikeComment(int id) {
		Session session = HibernateUI.getSession();
		LikeComment likeComment = session.get(LikeComment.class, id);
		session.close();
		
		return likeComment;
	}

}
