package com.greatlearning.java.emailApplication.model;

public class Employee {
	
private String firstName;
private String lastName;
private String emailAddress;
private String password;
private String departmentName;

public Employee(String firstName, String lastName)
{
	this.firstName = firstName;
	
	this.lastName = lastName;
}
public String getFirstName()
{
	return firstName;
}
public void setFirstName(String firstname)
{
	this.firstName = firstname;
}
public String getLastName()
{
	return lastName;
}
public void setLastName(String lastname)
{
	this.lastName = lastname;
}
public String getEmailAddress()
{
	return emailAddress;
}
public void setEmailAddress(String emailAddress)
{
	this.emailAddress = emailAddress;
}
public String getPassword()
{
return password;
}
public void setPassword(String password)
{
	this.password = password;
}
public String getDepartmentName()
{
	return departmentName;
}
public void setDepartmentName(String departmentname)
{
	this.departmentName = departmentname;
}
}
