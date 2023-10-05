package com.tapiwa.astericks;


public class Ohh
{
	public static void ohh(int i, int j)
	{
		System.out.printf("\n");	
		for (int i_ = 0; i_ <= i; i_++)
		{
			for (int j_ = 0; j_ <= j; j_++)
			{
				if (i_ == 0 || i_ == i || j_ == 0 || j_ == j)
			       		System.out.printf("%s ", "*");
				else
					System.out.printf("%s ", " ");
				
			}
			System.out.printf("\n");	
		}
	}
}
