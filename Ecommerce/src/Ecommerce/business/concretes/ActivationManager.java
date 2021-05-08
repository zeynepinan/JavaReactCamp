package Ecommerce.business.concretes;

import Ecommerce.business.abstracts.ActivationService;
import Ecommerce.entities.concretes.User;

public class ActivationManager implements ActivationService{

	@Override
	public boolean activeEmail(User user) {
		System.out.println("Hesap aktivasyonu ba�ar�yla sa�land�.");
		return true;
	}

	@Override
	public void active(User user) {
		System.out.println("Kullan�c� aktivasyon maili g�nderildi.");
	}

}
