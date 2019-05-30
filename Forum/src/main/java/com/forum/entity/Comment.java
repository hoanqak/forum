package com.forum.entity;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "content", length = 500, nullable = false)
	private String content;
	@ManyToOne
	@JoinColumn(name = "id_user")
	private Account account;
	@ManyToOne
	@JoinColumn(name = "id_post")
	private Post post;
	@ManyToOne
	@JoinColumn(name = "id_status")
	private StatusComment statusComment;
	@CreationTimestamp
	@Column(name = "create_date")
	private Date createDate;
	@UpdateTimestamp
	@Column(name = "update_date")
	private Date updateDate;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "comment")
	private List<ImageDescriptionComment> listImageDescriptionComments;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "comment")
	private List<ReplyComment> listReplyComment;

	public Comment(String content, Account account, Post post, StatusComment statusComment) {
		super();
		this.content = content;
		this.account = account;
		this.post = post;
		this.statusComment = statusComment;
	}

	public Comment(String content, Account account, Post post) {
		super();
		this.content = content;
		this.account = account;
		this.post = post;
	}

	public Comment() {
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public StatusComment getStatusComment() {
		return statusComment;
	}

	public void setStatusComment(StatusComment statusComment) {
		this.statusComment = statusComment;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public List<ImageDescriptionComment> getListImageDescriptionComments() {
		return listImageDescriptionComments;
	}

	public void setListImageDescriptionComments(List<ImageDescriptionComment> listImageDescriptionComments) {
		this.listImageDescriptionComments = listImageDescriptionComments;
	}

	public List<ReplyComment> getListReplyComment() {
		return listReplyComment;
	}

	public void setListReplyComment(List<ReplyComment> listReplyComment) {
		this.listReplyComment = listReplyComment;
	}

}
