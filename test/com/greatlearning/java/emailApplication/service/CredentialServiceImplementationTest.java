package com.greatlearning.java.emailApplication.service;

import com.greatlearning.java.emailApplication.model.Employee;

public class CredentialServiceImplementationTest {

	public static void main(String[] args) {
		
		//testPasswordGeneration();
		
		//testEmailAddressGeneration();
		
		testDisplayCredentials();

	}

	static void testPasswordGeneration()
	{
		testPasswordGeneration1();
	}
	
	static void testPasswordGeneration1()
	{
		ICredentialService credentialService = new CredentialServiceImplementation();
		
		String password = credentialService.generatePassword();
		
		System.out.println("Generated Password is :" + password);
		
		}
	static void testEmailAddressGeneration()
	{
		
	testEmailAddressGeneration1();

    }

     static void testEmailAddressGeneration1()

	{
    	ICredentialService credentialService = new CredentialServiceImplementation();
    	
 		String emailAddress = credentialService.generateEmailAddress("Sanajana", "Balaji", 4);
 		
 		System.out.println("Generated EmailAddress is :" + emailAddress);
	}
     static void testDisplayCredentials()
 	{
 		
    	 testDisplayCredentials1();

     }

      static void testDisplayCredentials1()
 	{
     	ICredentialService credentialService = new CredentialServiceImplementation();
     	
     	String firstName = "Krithick";
     	String lastName = "Sarathi";
     	int departmentCode = 3;
     	
     	Employee Krithick = new Employee(firstName, lastName);
     	
  		String emailAddress = credentialService.generateEmailAddress(firstName, lastName, departmentCode);
  		
  		Krithick.setEmailAddress(emailAddress);
  		
  		String password = credentialService.generatePassword();
  		
  		Krithick.setPassword(password);
  		
  		credentialService.displayCredentials(Krithick);
 	
}
}