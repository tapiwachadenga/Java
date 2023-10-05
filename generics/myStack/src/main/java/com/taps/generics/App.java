package com.taps.generics;

/**
 * Hello world!
 *
 */

import java.security.SecureRandom;

public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
	//
	SecureRandom num = new SecureRandom();
	final int numInt = num.nextInt(10);
	SecureRandom els = new SecureRandom();
	SecureRandom num1 = new SecureRandom();
	final int numDbl = els.nextInt(10);
	SecureRandom els1 = new SecureRandom();

	// Integer[] ints = new Integer[numInt];
	// Double[] dbls = new Double[numDbl];

        Stack<Integer> intStack = new Stack<Integer>(numInt);
        Stack<Double> dblStack = new Stack<Double>(numDbl);

	for ( int i = 0; i < numInt; i++ )
		intStack.push(els.nextInt(25));

	for ( int i = 0; i < numDbl; i++ )
		dblStack.push(els1.nextDouble());
/**
	Stack<Integer> intStack = new Stack<Integer>(numInt);
	Stack<Double> dblStack = new Stack<Double>(numDbl);

	for (int el: ints)
		intStack.push(el);

	for (double el: dbls)
		dblStack.push(el);
**/
	intStack.push(9);
	System.out.printf("\ncapacity: %d%s\n", numInt, intStack);
	System.out.printf("\ncapacity: %d%s \n\n", numDbl, dblStack);

	intStack.pop();
	intStack.pop();
	intStack.pop();
    }
}
