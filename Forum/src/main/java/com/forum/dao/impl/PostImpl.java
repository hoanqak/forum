package com.forum.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.forum.dao.PostDAO;
import com.forum.entity.Post;
import com.sell.hibernateUI.HibernateUI;

public class PostImpl implements PostDAO{

	public void insert(Post post) {
		Session session = HibernateUI.getSession();
		try {
			session.save(post);
			session.beginTransaction().commit();
		}catch (Exception e) {
			// TODO: handle exception
			session.beginTransaction().rollback();
		}
		finally {
			session.close();
		}
	}

	public void delete(Post post) {
		Session session = HibernateUI.getSession();
		try {
			session.delete(post);
			session.beginTransaction().commit();
		}catch (Exception e) {
			// TODO: handle exception
			session.beginTransaction().rollback();
		}
		finally {
			session.close();
		}
	}

	public void update(Post post) {
		Session session = HibernateUI.getSession();
		try {
			session.update(post);
			session.beginTransaction().commit();
		}catch (Exception e) {
			// TODO: handle exception
			session.beginTransaction().rollback();
		}
		finally {
			session.close();
		}
	}

	public Post getPost(int id) {
		Post post =  null;
		Session session = HibernateUI.getSession();
		post = session.get(Post.class, id);
		session.close();
		return post;
	}
	
	@SuppressWarnings("unchecked")
	public List<Post> getListPost(){
		Session session = HibernateUI.getSession();
		List<Post> list = null;
		list = session.createQuery("From " + Post.class.getName()).getResultList();
		session.close();
		return list;
	}

}
