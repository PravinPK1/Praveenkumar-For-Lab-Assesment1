package com.gl.Email.service;

import java.util.Random;

import com.gl.Email.model.Employee;

public class CredentialService {
	
	public char[] generatePassword() {
		
		String caps = "ABCDEFGHIJAKLMNOPQRSTUVWXYZ" ;
		String small = "abcdefghijklmnopqrstuvwxyz" ;
		String numbers = "012345678" ;
		String specialchar = "!@#$%^&=+" ;
		String bigString = caps + small + numbers + specialchar ;
		
		Random random = new Random () ;
		
		char [] password = new char[8];
		
		for (int i = 0; i < 8; i++ ) 
		{
			password[i] = bigString.charAt(random.nextInt(bigString.length()));
			
		}
		return password;
		
	}
	
	
	public String generateEmail(String firstName, String lastName, String department) 
	{
		
		return firstName+lastName+"@"+ department+"gl.com";
		
	}
	
	public void showCredentials(Employee employee, String Email, char[] generatePassword) 
	{
		
		System.out.println( "Dear "+employee.getFirstName()+ " Your generated credentials are as follows");
		System.out.println( " Email ---> " + Email);
		System.out.print( " Password ---> " +"");
		System.out.print ( generatePassword());
		
	}
	
	
}




 