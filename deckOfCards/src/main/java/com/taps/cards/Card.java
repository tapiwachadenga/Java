package com.taps.cards;

public class Card
{
	private final String face;
	private final String suit;

	public Card(String face, String suit)
	{
		this.face = face;
		this.suit = suit;
	}

	@Override
	public String toString()
	{
		return String.format("Card [%s of %s]", face, suit);
	}
}
