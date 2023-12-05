package com.greatlearning.java.emailApplication.service;

import com.greatlearning.java.emailApplication.model.Employee;

public interface ICredentialService {
	
	String generatePassword();
	
	String generateEmailAddress(String firstName, String lastName, int departmentCode);
	
	void displayCredentials(Employee employee);
	
}
