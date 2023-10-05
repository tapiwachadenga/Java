package com.taps.generics;

public class EmptyStackException extends RuntimeException
{
	public EmptyStackException()
	{
		this("Stack is empty");
	}

	public EmptyStackException(String msg)
	{
		super(msg);
	}
}
