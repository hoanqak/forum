package com.forum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "image_description_reply")
public class ImageDescriptionReply {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String image;
	@ManyToOne
	@JoinColumn(name = "id_reply")
	private ReplyComment replyComment;

	public ImageDescriptionReply(String image, ReplyComment replyComment) {
		super();
		this.image = image;
		this.replyComment = replyComment;
	}

	public ImageDescriptionReply() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public ReplyComment getReplyComment() {
		return replyComment;
	}

	public void setReplyComment(ReplyComment replyComment) {
		this.replyComment = replyComment;
	}

}
