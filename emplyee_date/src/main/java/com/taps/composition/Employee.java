package com.taps.composition;


public abstract class Employee implements Payable
{
	private static int empCount = 0;
	private String firstName;
	private String secondName;
	private Date birthDate;
	private Date hireDate;
	
	public Employee(String firstName, String secondName, Date birthDate, Date hireDate)
	{
		this.firstName = firstName;
		this.secondName = secondName;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
		empCount += 1;
	}

	public String toString()
	{
		return String.format("Employee[%s, %s, %s, %s]", firstName, secondName, birthDate, hireDate);
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getSecondName()
	{
		return secondName;
	}

	public static int getEmpCount()
	{
		return empCount;
	}

//	public abstract double earnings();
}
