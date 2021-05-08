package Ecommerce;

import Ecommerce.business.abstracts.UserService;
import Ecommerce.business.concretes.ActivationManager;
import Ecommerce.business.concretes.UserManager;
import Ecommerce.business.concretes.ValidationManager;
import Ecommerce.dataAccess.concretes.InMemoryUserDao;
import Ecommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		

		UserService userService =new UserManager(new ValidationManager(),new ActivationManager());
		
		User user=new User(1,"Zeynep","Ýnan","zeyy@gmail.com","ghjfdjh");
		User user1=new User(2,"Zeynep","Ýnan","zeyy@gmail.com","ghjfdjh");
		userService.register(user);
		userService.register(user1);
	}

}
