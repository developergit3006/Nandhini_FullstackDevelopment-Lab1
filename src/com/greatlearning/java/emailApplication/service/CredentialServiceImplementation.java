package com.greatlearning.java.emailApplication.service;
import com.greatlearning.java.emailApplication.model.Employee;

public class CredentialServiceImplementation implements ICredentialService{
	
	public String generatePassword()
	{
		PasswordGenerator passwordgenerator = new PasswordGenerator();
		String password = passwordgenerator.generate();
		return password;
	}
	public String generateEmailAddress(String firstName, String lastName, int departmentCode)
	{
		EmailAddressGenerator emailAddressGenerator = new EmailAddressGenerator();
		String emailAddress = emailAddressGenerator.generate(firstName, lastName, departmentCode);
		return emailAddress;
	}
	
	public void displayCredentials(Employee employee)
	{
		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append("Dear ");
		messageBuilder.append(employee.getFirstName());
		messageBuilder.append(", your generated credentials are as follows");
		
		String newline =System.getProperty("line.separator");
		messageBuilder.append(newline);
		messageBuilder.append("Email : ");
		messageBuilder.append(employee.getEmailAddress());
		
		messageBuilder.append(newline);
		messageBuilder.append("Password : ");
		messageBuilder.append(employee.getPassword());
		
		String finalMessage = messageBuilder.toString();
		System.out.println(finalMessage);
	}

}
