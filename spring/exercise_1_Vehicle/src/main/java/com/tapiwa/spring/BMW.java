package com.tapiwa.spring;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Vehicle
{
	public void make()
	{
		System.out.println("Who got the keys to my Bima???");
	}
}
