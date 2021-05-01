package JavaCampHomework3;

public class UserManager {

	public void add(User user) {
		System.out.println(user.firstName+" kaydedildi.");
		
	}
	public void logIn(User user) {
		
		System.out.println(user.email+ " Baþarýyla giriþ yapýldý");
	}
public void logOut(User user) {
		
		System.out.println(user.email+ " Baþarýyla çýkýþ yapýldý");
	}
}
