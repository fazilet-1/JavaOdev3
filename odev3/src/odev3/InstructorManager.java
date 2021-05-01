package odev3;

public class InstructorManager extends UserManager {
	
	public void add(User user) {
		super.add(user);
	}
	public void delete(User user) {
		super.delete(user);
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
