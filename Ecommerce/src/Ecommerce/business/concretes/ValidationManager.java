package Ecommerce.business.concretes;

import java.util.regex.Pattern;

import Ecommerce.business.abstracts.ValidationService;
import Ecommerce.entities.concretes.User;

public class ValidationManager implements ValidationService{

	private static final String mailPattern = "^[A-Z0-9._+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)?$";
	private static Pattern pattern = Pattern.compile(mailPattern, Pattern.CASE_INSENSITIVE);


	ValidationService validationService;
	public boolean isEmailValid(User user) {

		if (!user.getEmail().isEmpty()) {
			return pattern.matcher(user.getEmail()).find();
		}
		return false;
	}

	public boolean checkIsFilled(User user) {
		if (!user.getEmail().isEmpty() 
				&& !user.getFirstName().isEmpty() 
				&& !user.getLastName().isEmpty()
				&& !user.getPassword().isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validate(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakter uzunluðunda olmalýdýr.");
			return false;
		}
		
		if (user.getFirstName().length() < 2) {
			System.out.println("Ýsim en az 2 karakter uzunluðunda olmalýdýr.");
			return false;
		}
		
		if (user.getLastName().length() < 2) {
			System.out.println("Soyisim tek karakter olamaz.");
			return false;
		}
		

		if (isEmailValid(user) && user.getPassword().length() >= 6 
				&& user.getFirstName().length() > 2
				&& user.getLastName().length() > 2 
				&& checkIsFilled(user)) {
			System.out.println("Kullanýcý bilgileri doðrulandý " 
				+ user.getFirstName() + " " + user.getLastName());
			return true;
		} else {
			
			return false;
		}

	}

	


	
}
