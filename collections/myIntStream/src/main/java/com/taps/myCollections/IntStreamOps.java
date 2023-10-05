package com.taps.myCollections;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamOps
{
	private int[] ints;

	public IntStreamOps(int[] ints)
	{
		this.ints = ints;
	}

	public void printInts()
	{
		System.out.println("Original ints: ");
		IntStream.of(ints).forEach(value -> System.out.printf("%d ", value));
		System.out.println();
	}


	public void printCnts()
	{
		System.out.println("Number of elements: ");
		System.out.printf("%d ", IntStream.of(ints).count());
		System.out.println();
	}

	public void printSum()
	{
		System.out.println("Sum: ");
		System.out.printf("%d ", IntStream.of(ints).sum());
		System.out.println();	
	}

	public void printMinMax()
	{
		System.out.println("Sum: ");	
		System.out.printf("Min: %d\tMax: %d", IntStream.of(ints).min(), IntStream.of(ints).max());
		System.out.println();	
	}

	public void reduce()
	{
		System.out.println("Sum of squares : ");
		System.out.printf("%d ", IntStream.of(ints).reduce( 0, (x, y) -> x + y * y));
		System.out.println();
	}

	public void evensAndOrdered()
	{
		System.out.println("Ordered evens: ");
		IntStream.of(ints).filter(x -> x % 2 == 0).sorted().forEach(v -> System.out.printf("%d ", v));
		System.out.println();
	}
}
