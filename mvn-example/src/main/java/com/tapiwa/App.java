package com.tapiwa;

// import com.github.ricksbrown.cowsay.Cowsay;
/**
 * Hello world!
 *
 */

import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {

	Random r = new Random();
   	int x = r.nextInt(100);
	int y = r.nextInt(100);
	int result = add(x, y);

	String[] cowArgs = new String[] { String.valueOf(result) };
  //      String cowString = Cowsay.say(cowArgs);

        System.out.printf( "\nIf x = %d and y = %d, then add ( x, y ) = %d\n\n", x, y, result );
    }

    public static int add( int x, int y){
	return x + y;
    }
}
