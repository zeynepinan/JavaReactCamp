package JavaCampHomework3;

public class UserManager {

	public void add(User user) {
		System.out.println(user.firstName+" kaydedildi.");
		
	}
	public void logIn(User user) {
		
		System.out.println(user.email+ " Ba�ar�yla giri� yap�ld�");
	}
public void logOut(User user) {
		
		System.out.println(user.email+ " Ba�ar�yla ��k�� yap�ld�");
	}
}
