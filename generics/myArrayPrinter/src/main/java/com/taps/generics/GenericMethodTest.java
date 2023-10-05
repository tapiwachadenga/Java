package com.taps.generics;

public class GenericMethodTest
{
	public static <T> void printArray(T[] arr)
	{
		for (T element: arr)
			System.out.printf("%s ", element);
		System.out.println();
	}
}
