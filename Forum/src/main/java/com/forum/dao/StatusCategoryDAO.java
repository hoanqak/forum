package com.forum.dao;

import com.forum.entity.StatusCategory;

public interface StatusCategoryDAO {

	public void insert(StatusCategory statusCategory);
	public void delete(StatusCategory statusCategory);
	public void update(StatusCategory statusCategory);
	public StatusCategory getStatusCategory(int id);
}
