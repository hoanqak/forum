package com.forum.dao;

import com.forum.entity.Status;

public interface StatusDAO {

	public void insert(Status status);
	public void delete(Status status);
	public void update(Status status);
	public Status getStatus(int id);
	
}
