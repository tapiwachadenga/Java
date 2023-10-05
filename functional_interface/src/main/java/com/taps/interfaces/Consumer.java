package com.taps.interfaces;

@FunctionalInterface

public interface Consumer<T>
{
	void accept(T t);
}
