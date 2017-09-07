package com.cisco.blogger.data;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cisco.blogger.api.Blog;
import com.cisco.blogger.api.Comment;
import com.cisco.blogger.api.User;

@Component
public class DbSeeder implements CommandLineRunner {
	private BlogRepository blogRepository;
	
	
    public DbSeeder(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }
    
	@Override
	public void run(String... arg0) throws Exception {
		Blog preeteeBlog = new Blog("My first blog",new Date(),new Date(), "This is an autogenrated CMAD blog for Demo purpose.",
				0,new User(),Arrays.asList(new Comment("My first comment"),new Comment("My 2nd comment"),new Comment("My 3rd comment")));
		
		Blog preetee1Blog = new Blog("My 2nd blog",new Date(),new Date(), "This is an autogenrated CMAD blog for Demo purpose.",
				0,new User(),Arrays.asList(new Comment("My first comment"),new Comment("My 2nd comment"),new Comment("My 3rd comment")));
		
		Blog preetee2Blog = new Blog("My 3rd blog",new Date(),new Date(), "This is an autogenrated CMAD blog for Demo purpose.",
				0,new User(),Arrays.asList(new Comment("My first comment"),new Comment("My 2nd comment"),new Comment("My 3rd comment")));
		
		Blog preetee3Blog = new Blog("My 4th blog",new Date(),new Date(), "This is an autogenrated CMAD blog for Demo purpose.",
				0,new User(),Arrays.asList(new Comment("My first comment"),new Comment("My 2nd comment"),new Comment("My 3rd comment")));
		
	//delete all previous blogs. clean up DB.
		this.blogRepository.deleteAll();
		
	//add dummy blogs to DB.
		
		List<Blog> blogList = Arrays.asList(preeteeBlog,preetee1Blog,preetee2Blog,preetee3Blog);
		
		this.blogRepository.save(blogList);
	
	
	}

}
