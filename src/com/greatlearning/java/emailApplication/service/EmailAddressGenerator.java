package com.greatlearning.java.emailApplication.service;

import com.greatlearning.java.emailApplication.utils.EmailApplicationUtils;

public class EmailAddressGenerator {

	public String generate(String firstName,String lastName,int departmentCode)
	{
		String departmentName = EmailApplicationUtils.getDepartmentName(departmentCode);
		
		StringBuilder emailAddressBuilder = new StringBuilder();
		
		emailAddressBuilder.append(firstName.toLowerCase());
		
		emailAddressBuilder.append(".");
		
		emailAddressBuilder.append(lastName.toLowerCase());
		
		emailAddressBuilder.append("@");
		
		emailAddressBuilder.append(departmentName);
		
		emailAddressBuilder.append(".gl.com");
		
		String emailAddress = emailAddressBuilder.toString();
		return emailAddress;
	}

}
