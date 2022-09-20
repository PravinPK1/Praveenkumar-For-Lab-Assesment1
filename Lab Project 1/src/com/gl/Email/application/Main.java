package com.gl.Email.application;

import java.util.Scanner;

import com.gl.Email.model.Employee;
import com.gl.Email.service.CredentialService;

class Main {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Praveen","Pk" );
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatePassword ;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Techinical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
	
		if (input == 1) {
			
			generatedEmail = cs.generateEmail( employee.getFirstName().toLowerCase() , employee.getLastName().toLowerCase() , "Tech");
			
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatePassword);
			
		}
		
		else if (input == 2) {
			generatedEmail = cs.generateEmail( employee.getFirstName().toLowerCase() , employee.getLastName().toLowerCase() , "Admin");
		
		generatePassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatePassword);
		
		}
		
		else if (input == 3) {
			generatedEmail = cs.generateEmail( employee.getFirstName().toLowerCase() , employee.getLastName().toLowerCase() , "Human Resource");
		
		generatePassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatePassword);
		
		}
		
		else if (input == 4) {
			generatedEmail = cs.generateEmail( employee.getFirstName().toLowerCase() , employee.getLastName().toLowerCase() , "Legal");
		
		generatePassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatePassword);
		
		
		}
		
		
		else
		
		System.out.println("Enter a valid input");
			
		sc.close();

		
		
	}

}
