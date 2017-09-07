package com.cisco.blogger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.blogger.api.Blog;
import com.cisco.blogger.api.Comment;
import com.cisco.blogger.data.BlogRepository;
@Service
public class BlogServiceImpl implements BlogService {
	
	private BlogRepository blogRepository;
	 @Autowired
	  public void setBlogRepository(BlogRepository blogRepository) {
	        this.blogRepository = blogRepository;
	    }
	


	public String createBlog(Blog blog) {

		return null;

	}

	public Blog updateBlog(Blog blog) {
		
		return null;
	}

	public List<Blog> searchBlogs(String keyword) {
	//	return blogRepository.findByKeyword(keyword);
		return null;
	}

	public Blog viewBlog(String blogId) {
		return blogRepository.findById(blogId);
	}

	public List<Blog> listAllBlogs() {

		return blogRepository.findAll();
	}

	public void addComment(String id, Comment comment) {

		//blogRepository.addComment(id, comment);

	}

	@Override
	public void addComment(int blogId, Comment comment) {
		// TODO Auto-generated method stub
		
	}

	

	

}
