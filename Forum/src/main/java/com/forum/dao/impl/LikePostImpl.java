package com.forum.dao.impl;

import org.hibernate.Session;
import org.hibernate.dialect.identity.H2IdentityColumnSupport;

import com.forum.dao.LikePostDAO;
import com.forum.entity.LikePost;
import com.sell.hibernateUI.HibernateUI;

public class LikePostImpl implements LikePostDAO{

	public void insert(LikePost likePost) {
		Session session = HibernateUI.getSession();
		try {
			session.save(likePost);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
		}
	}

	public void delete(LikePost likePost) {
		Session session = HibernateUI.getSession();
		try {
			session.delete(likePost);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
		}
	}

	public void update(LikePost likePost) {
		Session session = HibernateUI.getSession();
		try {
			session.update(likePost);
			session.beginTransaction().commit();
		} catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
		}
	}

	public LikePost getLikePost(int id) {
		Session session = HibernateUI.getSession();
		LikePost likePost = session.get(LikePost.class, id);
		session.close();
		return likePost;
	}

}
