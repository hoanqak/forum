package com.forum.dao.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.forum.entity.Post;
import org.hibernate.Session;

import com.forum.dao.CategoryDAO;
import com.forum.entity.Category;
import com.forum.entity.StatusCategory;
import com.sell.hibernateUI.HibernateUI;
import org.springframework.stereotype.Repository;

@Repository
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
		Collections.sort(category.getListPost(), new Comparator<Post>() {
			public int compare(Post o1, Post o2) {
				if(o1.getId() < o2.getId())
					return 1;
				else return -1;
			}
		});
		return category;
	}
    public Post getPostById(int categoryId, int postId){
	    for(Post post : getCategory(categoryId).getListPost()){
	        if(post.getId() == postId){
	            return post;
            }
        }
	    return null;
    }
	@SuppressWarnings("unchecked")
	public List<Category> getListCategory() {
		List<Category> list = null;
		Session session = HibernateUI.getSession();
		list = session.createQuery("From " + Category.class.getName()).getResultList();
		session.close();
		return list;
	}

	public static void main(String[] args) {
		CategoryImpl category = new CategoryImpl();
		for (Post post: category.getCategory(1).getListPost()
			 ) {
			System.out.println(post.getId());
		}
	}
}
