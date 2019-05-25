package com.forum.dao.impl;

import com.forum.dao.StatusCategoryDAO;
import com.forum.entity.StatusCategory;
import com.sell.hibernateUI.HibernateUI;

public class StatusCategoryImpl implements StatusCategoryDAO {

	public void insert(StatusCategory statusCategory) {
		HibernateUI.insert(statusCategory);
	}

	public void delete(StatusCategory statusCategory) {
		HibernateUI.delete(statusCategory);
	}

	public void update(StatusCategory statusCategory) {
		// TODO Auto-generated method stub
		HibernateUI.update(statusCategory);
	}

	public StatusCategory getStatusCategory(int id) {
		StatusCategory statusCategory = new StatusCategory();
		StatusCategory category = (StatusCategory) HibernateUI.getObject(statusCategory, id);
		return category;
	}

}
