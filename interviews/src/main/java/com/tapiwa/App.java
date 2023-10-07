package com.tapiwa;

/**
 * Hello world!
 *
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.security.SecureRandom;

public class App 
{
    public static void main( String[] args )
    {

	SecureRandom ran = new SecureRandom();
	int high = 15;
	int low = 3;
	int size = ran.nextInt(high - low) + low;

	List<Integer> list = new ArrayList<Integer>();
	
        System.out.println();
        System.out.println("Before doubler()");
	
	for (int i = 0; i < size; i++)
	{
		list.add(ran.nextInt(100));
		System.out.printf("%d ", list.get(i));
	}
	

        System.out.println("\n\nAfter doubler()");
	for(Integer num: doubler(list))
		System.out.printf("%d ", num);
        System.out.println();
        System.out.println();
    }

    public static List<Integer> doubler(List<Integer> arr)
    {
	int size = arr.size();
	List<Integer> newArr = new ArrayList<Integer>(size);
	for (int i = 0; i < size; i++)
		newArr.add(arr.get(i) * 2);
        return newArr;
    }
}
