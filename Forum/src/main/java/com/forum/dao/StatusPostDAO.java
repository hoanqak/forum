package com.forum.dao;

import com.forum.entity.StatusPost;

public interface StatusPostDAO {

	public void insert(StatusPost statusPost);
	public void delete(StatusPost statusPost);
	public void update(StatusPost statusPost);
	public StatusPost getStatusPost(int id);
}
