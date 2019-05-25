package com.forum.dao;

import java.util.List;

import com.forum.entity.StatusReply;

public interface StatusReplyDAO {

	public void insert(StatusReply statusReply);
	public void delete(StatusReply statusReply);
	public void update(StatusReply statusReply);
	public StatusReply getStatusReply(int id);
	public List<StatusReply> getListStatusReply();
	
}
