package com.taps.generics;

/**
 * Hello world!
 *
 */

import java.util.Arrays;
import java.util.List;
import java.security.SecureRandom;

public class App 
{
    public static void main( String[] args )
    {
	//        System.out.println( "Hello World!" );
	//
       SecureRandom sizeMax = new SecureRandom();
       SecureRandom element = new SecureRandom();
       final int size = sizeMax.nextInt(15);
       Integer[] ints = new Integer[size];

       for (int i = 0; i < size; i++)
		ints[i] = element.nextInt(100);

       Double[] dbls = {0.9, 18.5, 9.2, 9.0, 90.0};
       Character[] chars = {'o', 'm'};	

       List<Integer> intsList = Arrays.asList(ints);	
       List<Double> dblsList = Arrays.asList(dbls);	
       List<Character> charsList = Arrays.asList(chars);	

       System.out.printf("Maximum of %s is: ", intsList.toString());
       System.out.println(MaxTest.maximum(ints));
       System.out.printf("Maximum of %s is: ", dblsList.toString());
       System.out.println(MaxTest.maximum(dbls));
       System.out.printf("Maximum of %s is: ", charsList.toString());
       System.out.println(MaxTest.maximum(chars));
       
    }
}
