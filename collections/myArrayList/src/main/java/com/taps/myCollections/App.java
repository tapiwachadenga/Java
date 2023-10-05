package com.taps.myCollections;

/**
 * Hello world!
 *		
 */
public class App 
{
    public static void main( String[] args )
    {
       	System.out.printf("\nBefore removal: " );
	CollectionTest.getColorsLs();
	CollectionTest.printLs();

       	CollectionTest.getColorsDel();
       	CollectionTest.removeCols();

       	System.out.printf("\n\nTo be removed: " );
	CollectionTest.printDels();

       	System.out.printf("\n\nAfter removal: " );
       	CollectionTest.printLs();
	System.out.printf("\n\n");
    }
}
