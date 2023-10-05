package com.taps.myCollections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest
{
	private static String[] colorsArr = {"RED", "GREEN", "BLUE", "WHITE", "BLACK"};
	private static List<String> colorsLs;

	public static void getColorsLs()
	{
		// for (String color : colorsArr)
		//	colorsLs.add(color);
		//
		colorsLs = new ArrayList(Arrays.asList(colorsArr));
	}

	private static String[] colorsDelArr = {"GREEN", "WHITE"};
	private static List<String> colorsDel;

	public static void getColorsDel()
	{
		// for (String color: colorsDelArr)
		//	colorsDel.add(color);
		//
		colorsDel = Arrays.asList(colorsDelArr);
	}
	
	public static void printDels()
	{
		for ( String col: colorsDel )
			System.out.printf("%s ", col);
	}

	public static void printLs()
	{
		for ( String col: colorsLs)
			System.out.printf("%s ", col);
	}

	public static void removeCols()
	{
		Iterator itr = colorsLs.iterator();

		while (itr.hasNext())
		{
			if(colorsDel.contains(itr.next()))
				itr.remove();
		}
	}
}
