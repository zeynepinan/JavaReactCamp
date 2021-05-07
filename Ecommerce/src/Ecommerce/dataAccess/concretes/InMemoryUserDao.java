package Ecommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Ecommerce.dataAccess.abstracts.UserDao;
import Ecommerce.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	
	private List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println("Kullanýcý sisteme eklendi : "+ user.getEmail());
		users.add(user);
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý sistemden silindi : "+ user.getEmail());
		users.remove(user);
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý sistemde güncellendi : "+ user.getEmail());
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
