package com.taps.interfaces;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	    Consumer<String> ucConsumer = (s) -> System.out.printf( "\nThe string typed is: %s\n", s);
	    ucConsumer.accept("Tapiwa Chadenga");
    }
}
