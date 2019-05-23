package com.forum.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.forum.dao.CategoryDAO;
import com.forum.entity.Category;
import com.forum.entity.StatusCategory;
import com.sell.hibernateUI.HibernateUI;

public class CategoryImpl implements CategoryDAO {

	public void insert(Category category) {
		Session session = HibernateUI.getSession();
		try {
			StatusCategory statusCategory = session.get(StatusCategory.class, 1);
			if(statusCategory == null) {
				statusCategory = new StatusCategory("open");
				session.save(statusCategory);
			}
			statusCategory = session.get(StatusCategory.class, 1);
			category.setStatusCategory(statusCategory);
			session.save(category);
			session.beginTransaction().commit();

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
			session.beginTransaction().commit();

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
			session.beginTransaction().commit();
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
