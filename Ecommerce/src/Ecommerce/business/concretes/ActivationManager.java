package Ecommerce.business.concretes;

import Ecommerce.business.abstracts.ActivationService;
import Ecommerce.entities.concretes.User;

public class ActivationManager implements ActivationService{

	@Override
	public boolean activeEmail(User user) {
		System.out.println("Hesap aktivasyonu baþarýyla saðlandý.");
		return true;
	}

	@Override
	public void active(User user) {
		System.out.println("Kullanýcý aktivasyon maili gönderildi.");
	}

}
