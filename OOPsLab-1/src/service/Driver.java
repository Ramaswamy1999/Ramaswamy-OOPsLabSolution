package service;

import java.util.Scanner;

import model.Employee;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String firstName = sc.nextLine();
		System.out.println("Please enter your last name");
		String lastName = sc.nextLine();
		
		Employee employee = new Employee(firstName, lastName);
		System.out.println("Please select your department");
		System.out.println("1. Technical");
		System.out.println("2. Administrative");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int user_input = sc.nextInt();
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		switch(user_input) {
		case 1:	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(employee, generatedEmail, generatedPassword);
				break;
		case 2 :generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"admin");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(employee, generatedEmail, generatedPassword);
				break;
		case 3 :generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"hr");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(employee, generatedEmail, generatedPassword);
				break;
		case 4 :generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(employee, generatedEmail, generatedPassword);
				break;
		default : System.out.println("Enter a valid option");
		}
	}

}
