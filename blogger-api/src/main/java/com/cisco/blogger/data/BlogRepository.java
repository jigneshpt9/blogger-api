package com.cisco.blogger.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.cisco.blogger.api.Blog;

@Repository
public interface BlogRepository extends MongoRepository<Blog,String>, QueryDslPredicateExecutor<Blog> {
	
	Blog findById(String id);

	//List<Blog> findByKeyword(String keyword);
	
	

}
