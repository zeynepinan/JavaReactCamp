package Ecommerce.business.abstracts;

import Ecommerce.entities.concretes.User;

public interface ValidationService {
	
	boolean isEmailValid(User user);

	boolean checkIsFilled(User user);

	boolean validate(User user);

}
