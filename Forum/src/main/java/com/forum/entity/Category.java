package com.forum.entity;

import java.util.*;

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
public class Category{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "link", length = 50, unique = true)
	private String link;
	@Column(name = "category_name", length = 100, nullable = false)
	private String categoryName;
	@ManyToOne
	@JoinColumn(name = "status")
	private StatusCategory statusCategory;

	@Column(name = "create_date")
	@CreationTimestamp
	private Date createDate;

	@Column(name = "update_date")
	@UpdateTimestamp
	private Date updateDate;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "category")
	private List<Post> listPost;

	public Category(String link, String categoryName, StatusCategory statusCategory, Date createDate, Date updateDate) {
		super();
		this.link = link;
		this.categoryName = categoryName;
		this.statusCategory = statusCategory;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	public Category(String link, String categoryName) {
		super();
		this.link = link;
		this.categoryName = categoryName;
	}

	public Category(String link, String categoryName, StatusCategory statusCategory) {
		super();
		this.link = link;
		this.categoryName = categoryName;
		this.statusCategory = statusCategory;

	}

	public Category() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public StatusCategory getStatusCategory() {
		return statusCategory;
	}

	public void setStatusCategory(StatusCategory statusCategory) {
		this.statusCategory = statusCategory;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public List<Post> getListPost() {
		return listPost;
	}

	public void setListPost(List<Post> listPost) {
		this.listPost = listPost;
	}

	public static void main(String[] args) {

	}
}
