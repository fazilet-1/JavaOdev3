package odev3;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() +" "+ "�simli Kullan�c� Eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() +" "+ "�simli Kullan�c� Silindi");
		
	}
	
	public void addMultiple(User[] users) {
		for(User user:users ) {
			add(user);
		}
	}
	
	public void deleteMultiple(User[] users) {
		for(User user:users) {
			delete(user);
		}
	}

}
