package com.taps.recursions;

import java.math.BigInteger;

public class Fibonacci
{
	private static BigInteger TWO = BigInteger.valueOf(2);

	public static BigInteger fibonacci(BigInteger num)
	{
		if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE))
			return num;
		return fibonacci(num.subtract(BigInteger.ONE)).add(fibonacci(num.subtract(BigInteger.valueOf(2))));
	}
}
