package com.cisco.blogger.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cisco.blogger.api.Blog;
import com.cisco.blogger.api.Comment;

public interface BlogService {
	
	public String createBlog(Blog blog);
	
	public Blog updateBlog(Blog blog);
	
	public List<Blog> searchBlogs(String keyword);
	
	public Blog viewBlog(String blogId);
	
	public List<Blog> listAllBlogs();
	
	public void addComment(int blogId,Comment comment);
	
}
