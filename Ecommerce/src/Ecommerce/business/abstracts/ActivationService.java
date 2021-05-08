package Ecommerce.business.abstracts;

import Ecommerce.entities.concretes.User;

public interface ActivationService {

	boolean activeEmail(User user);
	void active(User user);
}
