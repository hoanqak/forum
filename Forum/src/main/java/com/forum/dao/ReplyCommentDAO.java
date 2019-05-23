package com.forum.dao;

import com.forum.entity.ReplyComment;

public interface ReplyCommentDAO {

	public void insert(ReplyComment replyComment);
	public void update(ReplyComment replyComment);
	public void delete(ReplyComment replyComment);
	public ReplyComment getReplyComment(int id);
	
}
