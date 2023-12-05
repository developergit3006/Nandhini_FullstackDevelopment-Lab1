package com.greatlearning.java.emailApplication.service;

public class EmailAddressGeneratorTest {

	public static void main(String[] args) {
		
			testEmailAddress1();
			testEmailAddress2();
		}

		static void testEmailAddress1()
		{
			EmailAddressGenerator emailAddressGenerator = new EmailAddressGenerator();
			
			String emailAddress = emailAddressGenerator.generate("Sanjana", "Balaji", 3);
			
			System.out.println("Email Address : " +  emailAddress);
			
		}
		
		static void testEmailAddress2()
		{
				EmailAddressGenerator emailAddressGenerator = new EmailAddressGenerator();
				
				String emailAddress = emailAddressGenerator.generate("Krithick", "Sarathi", 1);
				
				System.out.println("Email Address : " +  emailAddress);
				
	    }

	}

