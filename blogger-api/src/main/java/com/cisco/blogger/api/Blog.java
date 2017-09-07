package com.cisco.blogger.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Blogs")
public class Blog {
	@Id
	private String id;
	private String title;
	private Date createTime;
	private Date lastUpdate;
	private String content;
	private int likeCount;
	private User blogOwner;
	private List<Comment> comments;

	
	public Blog() {
		super();
		this.comments = new ArrayList<>();
	}

	public Blog(String title, Date createTime, Date lastUpdate, String content, int likeCount, User blogOwner,
			List<Comment> comments) {
		super();
		this.title = title;
		this.createTime = createTime;
		this.lastUpdate = lastUpdate;
		this.content = content;
		this.likeCount = likeCount;
		this.blogOwner = blogOwner;
		this.comments = comments;
		}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date   lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public User getBlogOwner() {
		return blogOwner;
	}

	public void setBlogOwner(User blogOwner) {
		this.blogOwner = blogOwner;
	}

	public List<Comment> getComments() {
		if (null != comments)
			return comments;
		else
			return new ArrayList<Comment>();
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
