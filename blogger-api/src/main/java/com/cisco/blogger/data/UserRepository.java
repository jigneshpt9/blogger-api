package com.cisco.blogger.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.cisco.blogger.api.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>, QueryDslPredicateExecutor<User>{

//	User getUserByEmailId(String emailId);

}
