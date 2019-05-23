package com.forum.dao;

import com.forum.entity.ImageDescriptionComment;

public interface ImageDescriptionCommentDAO {

	public void insert(ImageDescriptionComment descriptionComment);
	public void update(ImageDescriptionComment descriptionComment);
	public void delete(ImageDescriptionComment descriptionComment);
	public ImageDescriptionComment getImageDescriptionComment(int id);
}
