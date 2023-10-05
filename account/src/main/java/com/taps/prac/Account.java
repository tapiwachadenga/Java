package com.taps.prac;

public class Account
{
	private String name;
	private double balance;

	public Account(String name, double balance)
	{
		this.name = name;

		if (balance > 0.0)
			this.balance = balance;
	}

	public double deposit(double depositAmount)
	{
		if (depositAmount > 0.0)
			balance += depositAmount;
		return balance;
	}


	public double withdraw(double withdrawalAmount)
	{
		if (balance >= withdrawalAmount){
			balance -= withdrawalAmount;
		}
		return balance;
	}

	public double getBalance()
	{
		return balance;	
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		String result = String.format ("\nAccount [ Name: %s; Balance: %.2f ]\n", this.name, this.balance);
		return result;
	}
}
