package com.taps;

/**
 * Hello world!
 *
 */

import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
	int x = (new Random()).nextInt( 10000 );
	int y = (new Random()).nextInt( 10000 );

	App app = new App();
	int result = app.mult(x, y);
	String str1 = "Taps";
	String str2 = " Chibaba.";
	String str = String.format("\nmult ( %d, %d ) = %d\n", x, y, app.mult( x, y ));
	System.out.println(str);
	String str3 = String.format("concate ( %s, %s ) = %s\n", str1, str2, app.concate ( str1, str2 ));
	System.out.println(str3);
    }

    public int mult ( int x, int y ) 
    {
	return x * y;
    }

    public String concate ( String str1, String str2)
    {
	    return str1 + str2;
    }
}
