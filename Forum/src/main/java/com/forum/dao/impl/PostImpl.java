package com.forum.dao.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.forum.entity.Comment;
import org.hibernate.Session;

import com.forum.dao.PostDAO;
import com.forum.entity.Post;
import com.sell.hibernateUI.HibernateUI;
import org.springframework.stereotype.Repository;

@Repository
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
		list = session.createQuery("From com.forum.entity.Post as p order by p.id desc").getResultList();
		session.close();
		return list;
	}
	public List<Post> getNewPost(){
		List<Post> list = null;
		Session session = HibernateUI.getSession();
		list = session.createQuery("FROM com.forum.entity.Post as p order by p.id desc").setMaxResults(10).getResultList();
		return list;
	}

	public static void main(String[] args) {
		PostImpl post = new PostImpl();
		System.out.println(post.getNewPost().size());
//		List<Post> posts = post.getNewPost();
//		for (Post post1: posts
//			 ) {
//			System.out.println(post1);
//		}
	}
}
