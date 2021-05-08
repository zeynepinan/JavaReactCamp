package Ecommerce.dataAccess.abstracts;

import java.util.List;

import Ecommerce.entities.concretes.User;

public interface UserDao {

	void register(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	List<User> getAll();
}
