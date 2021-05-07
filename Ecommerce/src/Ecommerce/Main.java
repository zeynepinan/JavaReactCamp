package Ecommerce;

import Ecommerce.business.abstracts.UserService;
import Ecommerce.business.concretes.UserManager;
import Ecommerce.dataAccess.concretes.GoogleUserDao;
import Ecommerce.dataAccess.concretes.InMemoryUserDao;
import Ecommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		

		UserService userService =new UserManager(new GoogleUserDao());
		
		User user=new User(1,"Zeynep","Ýnan","zeyy@gmail.com","dfdfd");
		userService.add(user);
	}

}
