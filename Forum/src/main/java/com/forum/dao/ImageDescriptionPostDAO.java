package com.forum.dao;

import com.forum.entity.ImageDescriptionPost;

public interface ImageDescriptionPostDAO {

	public void insert(ImageDescriptionPost descriptionPost);
	public void delete(ImageDescriptionPost descriptionPost);
	public void update(ImageDescriptionPost descriptionPost);
	public ImageDescriptionPost getImageDescriptionPost(int id);
}
