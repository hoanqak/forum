package com.forum.dao;

import com.forum.entity.Post;

public interface PostDAO {

	public void insert(Post post);
	public void delete(Post post);
	public void update(Post post);
	public Post getPost(int id);
	
}
