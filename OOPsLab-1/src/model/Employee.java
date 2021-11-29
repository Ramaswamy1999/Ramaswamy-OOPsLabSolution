package model;

public class Employee {
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setFirstName() {
		this.firstName = firstName;
	}
	public void setLastName() {
		this.lastName = lastName;
	}
}
