package com.taps.array;

/**
 * Hello world!
 *
 */

import java.util.Arrays;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
	
	Random random = new Random();
    	final int num = random.nextInt(20) + 1;

        App app = new App();
	int[] arr = app.myIntArray(num);
	System.out.println("\n" + Arrays.toString(arr));
	String str = String.format("\nAverage: %.2f", app.myAverage(arr));
	System.out.println(str + "\n");
    }

    public int[] myIntArray(final int num)
    {
	Random random = new Random();
    	// final int num = random.nextInt(20) + 1;
	int[] arr = new int[num];

	for (int i=0; i<num; i++)
	{
		arr[i] = random.nextInt(25);
	}

	return arr;
    }

    public double myAverage(int[] arr)
    {
	App app = new App();
	return (double) app.intArraySum(arr) / (double) arr.length;
    }

    public int intArraySum(int[] arr)
    {
	int sum = 0;
	for (int i=0; i<arr.length; i++)
	{
		sum += arr[i];
	}

	return sum;
    }
}
