package com.forum.dao;

import java.util.List;

import com.forum.entity.Category;

public interface CategoryDAO{

	public void insert(Category category);
	public void delete(Category category);
	public void update(Category category);
	public Category getCategory(int id);
	public List<Category> getListCategory();
}
