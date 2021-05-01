package odev3;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(1);
		student.setFirstName("Fazilet");
		student.setLastName("İnaç");
		student.setUserName("fazilet-1");
		student.setEmail("fazilet@gmail.com");
		student.setPassWord("123456");
		student.setStudentNumber("8076");

		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("abc@gmail.com");
		instructor.setPassWord("78910");
		instructor.setInstructorNumber("105");
		instructor.setSalary(12500);

		User[] users = {student,instructor};
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
		
		InstructorManager instructorManager= new InstructorManager();
		
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(instructor);
		instructorManager.delete(student);
		
		

	}

}
