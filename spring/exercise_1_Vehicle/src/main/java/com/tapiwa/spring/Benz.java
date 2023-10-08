package com.tapiwa.spring;

import org.springframework.stereotype.Component;

@Component
public class Benz implements Vehicle
{
	public void make()
	{
		System.out.println("My benzo my nizzo!!!");
	}
}
