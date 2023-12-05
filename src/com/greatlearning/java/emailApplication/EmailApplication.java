package com.greatlearning.java.emailApplication; 

import java.util.Scanner;

import com.greatlearning.java.emailApplication.model.Employee;
import com.greatlearning.java.emailApplication.service.CredentialServiceImplementation;
import com.greatlearning.java.emailApplication.service.ICredentialService;

public class EmailApplication {
	
	public static void main (String[] args)
	{
		Scanner input= new Scanner(System.in);
		
		System.out.println("Welcome to Email Applicatioin");
		
		System.out.println("Enter your first name");
		String firstName = input.nextLine();
		
		System.out.println("Enter your last name");
		String lastName = input.nextLine();
		
		System.out.println("Enter your Department");
		System.out.println("To specify your Department, enter the corresponding Department number");
		
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	
	
		int departmentCode = input.nextInt();
		
		ICredentialService credentialService = new CredentialServiceImplementation();
		
		Employee employeeObject = new Employee(firstName, lastName);
		String emailAddress = credentialService.generateEmailAddress(firstName, lastName, departmentCode);
		employeeObject.setEmailAddress(emailAddress);
		
		String password = credentialService.generatePassword();
		employeeObject.setPassword(password);
		credentialService.displayCredentials(employeeObject);
		
		input.close();
	
	}

}
