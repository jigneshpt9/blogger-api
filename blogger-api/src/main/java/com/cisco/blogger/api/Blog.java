package com.cisco.blogger.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Blogs")
public class Blog {
	
	private String id;
	private String title;
	private String createTime;
	private String lastUpdate;
	private String content;
	private int likeCount;
	private User blogOwner;
	private List<Comment> comments;
	private List<Image> imageList;

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
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

	public List<Image> getImageList() {
		return imageList;
	}

	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
