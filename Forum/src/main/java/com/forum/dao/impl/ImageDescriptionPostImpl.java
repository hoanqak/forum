package com.forum.dao.impl;

import org.hibernate.Session;

import com.forum.dao.ImageDescriptionPostDAO;
import com.forum.entity.ImageDescriptionPost;
import com.sell.hibernateUI.HibernateUI;

public class ImageDescriptionPostImpl implements ImageDescriptionPostDAO{

	public void insert(ImageDescriptionPost descriptionPost) {
		Session session = HibernateUI.getSession();
		try {
			session.save(descriptionPost);
			session.beginTransaction().commit();
		}
		catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
			// TODO: handle finally clause
		}
	}

	public void delete(ImageDescriptionPost descriptionPost) {
		Session session = HibernateUI.getSession();
		try {
			session.delete(descriptionPost);
			session.beginTransaction().commit();
		}
		catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
			// TODO: handle finally clause
		}
	}

	public void update(ImageDescriptionPost descriptionPost) {
		Session session = HibernateUI.getSession();
		try {
			session.update(descriptionPost);
			session.beginTransaction().commit();
		}
		catch (Exception e) {
			session.beginTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
			// TODO: handle finally clause
		}
	}

	public ImageDescriptionPost getImageDescriptionPost(int id) {
		Session session = HibernateUI.getSession();
		ImageDescriptionPost descriptionPost = session.get(ImageDescriptionPost.class, id);
		session.close();
		return descriptionPost;
	}

}
