package com.forum.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
@Table(name = "reply_comment")
public class ReplyComment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 500)
	private String content;
	@ManyToOne
	@JoinColumn(name = "id_comment")
	private Comment comment;
	@ManyToOne
	@JoinColumn(name = "id_user")
	private Account account;
	@ManyToOne
	@JoinColumn(name = "id_reply")
	private StatusReply statusReply;
	@Column(name = "create_date")
	@CreationTimestamp
	private Date createDate;
	@Column(name = "update_date")
	@UpdateTimestamp
	private Date updateDate;

	public ReplyComment(String content, Comment comment, Account account, Date createDate, Date updateDate) {
		super();
		this.content = content;
		this.comment = comment;
		this.account = account;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public ReplyComment() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public StatusReply getStatusReply() {
		return statusReply;
	}

	public void setStatusReply(StatusReply statusReply) {
		this.statusReply = statusReply;
	}

	public Date getCreateDate() {
		return createDate;
	}


	public Date getUpdateDate() {
		return updateDate;
	}

}
