package Ecommerce.business.concretes;

import java.util.List;

import Ecommerce.business.abstracts.UserService;
import Ecommerce.dataAccess.abstracts.UserDao;
import Ecommerce.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public void logIn(User user, String email, String password) {
		if (email == user.getEmail() && password == user.getPassword()) {
			System.out.println("Sisteme giriþ yapýldý");
		} else {
			System.out.println("Mail adresinizi veya þifrenizi yanlýþ girdiniz");
		}
		
	}

	@Override
	public void add(User user) {
		this.userDao.add(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
