package com.taps.composition;

public class SalaryEmployee extends Employee
{
	private double wklSalary;

	public SalaryEmployee(String fn, String sn, Date dob, Date doh, double wSal)
	{
		super(fn, sn, dob, doh);
		this.wklSalary = wSal;
	}

	public double getWklSalary()
	{
		return wklSalary;
	}

	public void setWklSalary(double wSal)
	{
		this.wklSalary = wSal;
	}

	@Override
	public double getPaymentAmount()
	{
		return 4 * getWklSalary();
	}

	@Override
	public String toString()
	{
		return String.format("\nSalaried Employee [%s, %s, %.2f, %.2f]\n", super.getFirstName(), super.getSecondName(), getWklSalary(), getPaymentAmount());
	}
}
