package com.taps.cards;

// import com.taps.cards.Card;
import java.security.SecureRandom;

public class DeckOfCards
{
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	private static final SecureRandom randomNumbers = new SecureRandom();

	public DeckOfCards()
	{
		String[] faces = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;

		for (int suit = 0, cnt = 0; suit < suits.length; suit++)
			for (int face = 0; face < faces.length; face++)
			{
				deck[cnt] = new Card(faces[face], suits[suit]);
				cnt++;
			}	
	}

	public void shuffle()
	{
		for ( int cnt = 0; cnt < deck.length; cnt++)
		{
			int random = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[cnt];
			deck[cnt] = deck[random];
			deck[random] = temp;
		}
	}

	public Card dealCard()
	{
		if ( currentCard < deck.length )
		{
			return deck[currentCard++];	
		}
		else 
			return null;
	}
/**
	@Override
	public String toString()
	{
		for ( int i = 0; i < NUMBER_OF_CARDS; i++)
		{
			deck[i]

		}	
		**/

	public Card[] getDeck()
	{
		return deck;
	}
}
