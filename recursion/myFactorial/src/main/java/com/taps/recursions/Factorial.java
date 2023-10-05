package com.taps.recursions;

import java.math.BigInteger;

public class Factorial
{
	public static BigInteger factorial(BigInteger num)
	{
		if (num.compareTo(BigInteger.ZERO) <= 0)
			return BigInteger.ONE;
		return num.multiply(factorial(num.subtract(BigInteger.ONE)));
	}
}
