package com.cisco.blogger.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cisco.blogger.api.Blog;
import com.cisco.blogger.api.Comment;
import com.cisco.blogger.api.Reply;

@Repository
public interface BlogDAO {
	
	public String createBlog(Blog blog);
	
	public Blog updateBlog(Blog blog);
	
	public List<Blog> searchBlogs(String keyword);
	
	public Blog viewBlog(int blogId);
	
	public List<Blog> listAllBlogs();
	
	public void addComment(int blogId,Comment comment);
	
	public int upvoteComment(int commentId);
	
	public int undoLikeComment(int commentId);
	
	public void replyOnComment(int commentId, Reply reply);
	
	

}
