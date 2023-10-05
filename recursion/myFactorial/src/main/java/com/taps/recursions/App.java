package com.taps.recursions;

/**
 * Hello world!
 *
 */

import java.util.Scanner;
import java.math.BigInteger;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter number: " );
	Scanner inputString = new Scanner(System.in);
	int inputInt = inputString.nextInt();
	System.out.printf("factorial(%d) = %d\n", inputInt, Factorial.factorial(BigInteger.valueOf(inputInt)));
	System.out.printf("fibonacci(%d) = %d\n", inputInt, Fibonacci.fibonacci(BigInteger.valueOf(inputInt)));
    }
}
