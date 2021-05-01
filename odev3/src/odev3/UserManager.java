package odev3;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() +" "+ "Ýsimli Kullanýcý Eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() +" "+ "Ýsimli Kullanýcý Silindi");
		
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
