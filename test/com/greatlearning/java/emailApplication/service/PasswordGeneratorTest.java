package com.greatlearning.java.emailApplication.service;

public class PasswordGeneratorTest {
	
	public static void main(String[] args)
	{
		testRun1();
		testRun2();
	}

	static void testRun1()
	{
		PasswordGenerator passwordGenerator = new PasswordGenerator();
		
		String password = passwordGenerator.generate();
		
		System.out.println("Generated Password : testRun1 method :" + password);
		
	}
	
	static void testRun2()
	{
		for(int index=1; index<=5; index++)
		{
			
        PasswordGenerator passwordGenerator = new PasswordGenerator();
		
		String password = passwordGenerator.generate();
		
		System.out.println("Generated Password : testRun2 method :" + password);
		
		}		
	}
}
