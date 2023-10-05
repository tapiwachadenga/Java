package com.taps.generics;

import java.util.ArrayList;

public class Stack<T>
{
	private final ArrayList<T> elements;
	private final int initCapacity;

	public Stack()
	{
		this(5);
	}

	public Stack(int capacity)
	{
		initCapacity = capacity > 0 ? capacity : 5;
		elements = new ArrayList<T>(initCapacity);
	}

	public void push(T element)
	{
		if (elements.size() == initCapacity)
			System.out.printf( String.format("\nStack has %d elements; cannot push.\n", initCapacity) );
		else
			elements.add(element);
		
	}

	public T pop()
	{
		if (elements.isEmpty())
			throw new EmptyStackException("\nStac ois empty, cannot pop.\n");

		return elements.remove(elements.size() - 1);
	}

	@Override
	public String toString()
	{
		return String.format("\nStack: %s", elements);
	}
}
