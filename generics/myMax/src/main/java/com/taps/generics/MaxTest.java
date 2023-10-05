package com.taps.generics;

import java.lang.Comparable;

public class MaxTest
{
	public static <T extends Comparable<T>> T maximum(T[] arr)
	{
		T max = arr[0];
/**
		if (arr[1].compareTo(max) > 0)
			max = arr[1];

		if (arr[2].compareTo(max) > 0)
			max = arr[2];
**/

		for (T element: arr)
		{
			if (element.compareTo(max) > 0)
				max = element;
		}

		return max;
	}
}
