package com.taps.bankApp;

public enum BankMenuOption
{
	ZERO(1),
	DEBIT(2),
	CREDIT(3).
	END(4);

	private final int value;

	private BankMenuOption(int value)
	{
		this.value = value % 4;
	}	
}
