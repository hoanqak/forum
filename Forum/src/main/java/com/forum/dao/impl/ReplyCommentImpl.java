package com.forum.dao.impl;

import org.hibernate.Session;

import com.forum.dao.ReplyCommentDAO;
import com.forum.entity.ReplyComment;
import com.sell.hibernateUI.HibernateUI;

public class ReplyCommentImpl implements ReplyCommentDAO {

	public void insert(ReplyComment replyComment) {
		HibernateUI.update(replyComment);
	}

	public void update(ReplyComment replyComment) {
		HibernateUI.update(replyComment);
	}

	public void delete(ReplyComment replyComment) {
		HibernateUI.delete(replyComment);
	}

	public ReplyComment getReplyComment(int id) {
		Session session =HibernateUI.getSession();
		ReplyComment replyComment = session.get(ReplyComment.class, id);
		session.close();
		
		return replyComment;
	}

}
