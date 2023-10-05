package com.taps.composition;

public class HourlyEmployee extends Employee
{
	private double wages;
	private double hours;

	public HourlyEmployee(String fname, String sname, Date dob, Date doh, double wgs, double hrs)
	{
		super(sname, sname, dob, doh);
		this.wages = wgs;
		this.hours = hrs;
	}

	public double getWages()
	{
		return wages;
	}

	public void setWages(double wgs)
	{
		this.wages = wgs;
	}

	public void setHours(double hrs)
	{
		this.hours = hrs;
	}

	public double getHours()
	{
		return hours;
	}

	@Override
	public double getPaymentAmount()
	{
		if ( getHours() <= 40.0)
			return getWages() * getHours();
		else
			return 40 * getWages() + (getHours() - 40) * getWages() * 1.5;
	}

	@Override
	public String toString()
	{
		return String.format("\nHourly Employee [%s, %s, %.2f]\n", super.getFirstName(), super.getSecondName(), getPaymentAmount());
	}
}
