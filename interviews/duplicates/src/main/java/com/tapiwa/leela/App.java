package com.tapiwa.leela;

/**
 * Hello world!
 *
 */
import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
	Integer[] nums =  {1, 3, 4, 2, 9, 7, 6};
        System.out.printf( "\nThe array %s has duplicate: %b\n\n", Arrays.toString(nums), ContainsDuplicate.containsDuplicate(nums) );
    }
}
