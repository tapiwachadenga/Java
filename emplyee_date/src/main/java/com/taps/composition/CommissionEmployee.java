package com.taps.composition;

public class CommissionEmployee extends Employee
{
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String secondName, Date dob, Date doh, double grossSales, double commissionRate)
	{
		super(firstName, secondName, dob, doh);

		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be > than 0.0");

		if (commissionRate < 0.0)
			throw new IllegalArgumentException("Commission rate must be > than 0.0");

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales()
	{
		return grossSales;
	}

	public double getCommissionRate()
	{
		return commissionRate;
	}

	public void setGrossSales(double grossSales)
	{
		if(grossSales < 0.0) throw new IllegalArgumentException("Gross sales must be > then 0.0");
		this.grossSales = grossSales;
	}

	public void setCommissionRate(double commissionRate)
	{
		if(commissionRate < 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate should be between 0.0 and 1.0");

		this.commissionRate = commissionRate;
	}

	@Override
	public double getPaymentAmount()
	{
		return getCommissionRate() * getGrossSales();
	}

	@Override 
	public String toString()
	{
		return String.format("\nCommission Employee [Name: %s %s; Commission: %.2f; Sales: %.2f; Earnings: %.2f]\n\n", super.getFirstName(), super.getSecondName(), getCommissionRate(), getGrossSales(), getPaymentAmount());
	}
}
