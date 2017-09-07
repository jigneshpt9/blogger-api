package com.cisco.blogger.data;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.cisco.blogger.api.Blog;
import com.cisco.blogger.api.Comment;
import com.cisco.blogger.api.Reply;

public class BlogDAOImpl implements BlogDAO {

	public BlogDAOImpl() {

	}

	public String createBlog(Blog blog) {

		return blog.getId();

	}

	public Blog updateBlog(Blog blog) {

		return blog;
	}

	public List<Blog> searchBlogs(String keyword) {
		System.out.println("In search method for keyword:" + keyword);
		List<Blog> blogSearchList = null;

		return blogSearchList;
	}

	public Blog viewBlog(int blogId) {

		return null;
	}

	public List<Blog> listAllBlogs() {
		List<Blog> blogList = null;
		return blogList;
	}

	public void addComment(int blogId, Comment comment) {
		Blog blog = viewBlog(blogId);
		List<Comment> comments = blog.getComments();

		comments.add(comment);
		updateBlog(blog);

	}

	public int upvoteComment(int commentId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int undoLikeComment(int commentId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void replyOnComment(int commentId, Reply reply) {

	}

	

}
