package com.forum.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.forum.dao.CategoryDAO;
import com.forum.entity.Category;
import com.sell.hibernateUI.HibernateUI;

public class CategoryImpl implements CategoryDAO {

	public void insert(Category category) {
		Session session = HibernateUI.getSession();
		try {
			session.save(category);
		} catch (Exception e) {
			session.beginTransaction().rollback();
		} finally {
			session.close();
		}
	}

	public void delete(Category category) {
		Session session = HibernateUI.getSession();
		try {
			session.delete(category);
		} catch (Exception e) {
			session.beginTransaction().rollback();
		} finally {
			session.close();
		}
	}

	public void update(Category category) {
		Session session = HibernateUI.getSession();
		try {
			session.update(category);
		} catch (Exception e) {
			session.beginTransaction().rollback();
		} finally {
			session.close();
		}
	}

	public Category getCategory(int id) {
		Category category = null;
		Session session = HibernateUI.getSession();
		category = session.get(Category.class, id);
		session.close();
		return category;
	}

	@SuppressWarnings("unchecked")
	public List<Category> getListCategory() {
		List<Category> list = null;
		Session session = HibernateUI.getSession();
		list = session.createQuery("From " + Category.class.getName()).getResultList();
		session.close();
		return list;
	}

}
