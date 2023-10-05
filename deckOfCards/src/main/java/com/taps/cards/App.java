package com.taps.cards;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DeckOfCards doc = new DeckOfCards();

	for (Card cd: doc.getDeck())
		System.out.println(cd);
	System.out.println("\n");
	doc.shuffle();

	for ( Card cd: doc.getDeck())
		System.out.println(cd);

	System.out.println("\nDeal: " + doc.dealCard());
	// System.out.println("\n");
	System.out.println("Deal: " + doc.dealCard());
    }
}
