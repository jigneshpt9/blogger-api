package com.cisco.blogger.service;
import com.cisco.blogger.api.DuplicateUserException;
import com.cisco.blogger.api.User;
import com.cisco.blogger.data.UserDAO;
import com.cisco.blogger.data.UserDAOImpl;

public class UserServiceImpl implements UserService {

    UserDAO userdao = new UserDAOImpl();
	public void registerUser(User user) {
		System.out.println("in registerUser entry");
		if (ifUserExists(user.getEmailId())){
			throw new DuplicateUserException("Duplicate user register request received with email id"+ user.getEmailId());
		}
		System.out.println("in registerUser exit");
		userdao.create(user);
		
	}

	public void updateUser(User user) {
		userdao.updateUser(user);
	}

	public User validateUser(String emailId, String password) {
		System.out.println("in validate user");
		 User user = userdao.findUser(emailId);
		System.out.println(password +" "+user.getPassword());
		 if (password.equals(user.getPassword())){
			 System.out.println("matched");
			 return user;
		 }
		return null;
	}

	public boolean ifUserExists(String emailId)
	{
		User result = userdao.findUser(emailId);
		if (result!= null){
		   return true;
		}  
		return false;
	}

	@Override
	public User findUser(String emailId) {
		return userdao.findUser(emailId);
	}
}
