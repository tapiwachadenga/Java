package com.taps.generics;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
       //
       Integer[] ints = {9, 7, 5, 4, 2, 0};
       Double[] dbs = {0.9, 8.5, 9.2};
       Character[] chars = {'o', 'm', 'g', 't', 'a', 'p', 's'};

       GenericMethodTest.printArray(ints);
       GenericMethodTest.printArray(dbs);
       GenericMethodTest.printArray(chars);
    }
}
