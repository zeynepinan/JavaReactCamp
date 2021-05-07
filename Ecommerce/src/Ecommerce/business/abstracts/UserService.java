package Ecommerce.business.abstracts;

import java.util.List;

import Ecommerce.entities.concretes.User;

public interface UserService {


	void logIn(User user, String email, String password);
	void add( User user);
	void delete(User user);
	void update(User user);
	User get(String email);
	List<User> getAll();
	
}
