package odev3;

public class Instructor extends User {
	private String instructorNumber;
	private double salary;
	
	public Instructor() {
		
	}
	
	public Instructor(String instructorNumber, double salary) {
		super();
		this.instructorNumber = instructorNumber;
		this.salary = salary;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
