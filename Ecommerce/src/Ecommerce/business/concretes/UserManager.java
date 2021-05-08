package Ecommerce.business.concretes;

import java.util.List;

import Ecommerce.business.abstracts.ActivationService;
import Ecommerce.business.abstracts.UserService;
import Ecommerce.business.abstracts.ValidationService;
import Ecommerce.dataAccess.abstracts.UserDao;
import Ecommerce.entities.concretes.User;

public class UserManager implements UserService{

	ValidationService validationService;
	ActivationService activationService;
	public UserManager(ValidationService validationService, ActivationService activationService) {
		super();
		this.validationService = validationService;
		this.activationService = activationService;
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
	public void register(User user) {
		if (validationService.validate(user)) {
			activationService.active(user);
			if (activationService.activeEmail(user)) {
				System.out.println("Kullanýcý baþarýlý bir þekilde kaydedilmiþtir" + user.getFirstName() + " "
						+ user.getLastName());
			} else {
				System.out.println("Aktivasyon linki için mailinizi kontrol ediniz.");
			}
		}
		
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
