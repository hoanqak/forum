package com.forum.entity;

import java.util.Collections;
import java.util.Comparator;
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
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title", length = 100)
    private String title;
    @Column(length = 100, name = "short_description")
    private String shortDescription;
    @Column(length = 1000, name = "long_description")
    private String longDescription;
    @Column(name = "create_date")
    @CreationTimestamp
    private Date createDate;
    @Column(name = "update_date")
    @UpdateTimestamp
    private Date updateDate;

    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;
    @ManyToOne
    @JoinColumn(name = "id_status")
    private StatusPost statusPost;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "post")
    private List<Comment> listComment;
    @OneToMany(mappedBy = "post")
    private List<LikePost> listLike;

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public List<Comment> getListComment() {
        Collections.sort(this.listComment, new Comparator<Comment>() {
            public int compare(Comment o1, Comment o2) {
                if (o1.getId() > o2.getId())
                    return 1;
                else
                    return -1;
            }
        });

        return listComment;
    }

    public void setListComment(List<Comment> listComment) {
        this.listComment = listComment;
    }

    public List<LikePost> getListLike() {
        return listLike;
    }

    public void setListLike(List<LikePost> listLike) {
        this.listLike = listLike;
    }

    public Post(String title, String sortDescription, String longDescription, Date createDate, Date updateDate,
                Account account, Category category) {
        super();
        this.title = title;
        this.shortDescription = sortDescription;
        this.longDescription = longDescription;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.account = account;
        this.category = category;
    }

    public Post() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSortDescription() {
        return shortDescription;
    }

    public void setSortDescription(String sortDescription) {
        this.shortDescription = sortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public StatusPost getStatusPost() {
        return statusPost;
    }

    public void setStatusPost(StatusPost statusPost) {
        this.statusPost = statusPost;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", account=" + account +
                ", statusPost=" + statusPost +
                ", category=" + category +
                ", listComment=" + listComment +
                ", listLike=" + listLike +
                '}';
    }
}
