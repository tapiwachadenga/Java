package com.taps.filesAndDirectory;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
	public static Scanner sc; 

	public static void ReadFrom(String fn)
	{
		openFile(fn);
		readRecords();
		closeFile();
	}

	public static void openFile(String fn)
	{
		try
		{
			sc = new Scanner(Paths.get(fn));
		}
		catch(IOException iOException)
		{
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
	}

	public static void readRecords()
	{
		System.out.printf("%n%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");
		
		try 
		{
			while(sc.hasNext())
			{
			     System.out.printf("%-10d%-12s%-12s%10.2f%n", sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
			}
		}
		catch(NoSuchElementException noSuchElementException)
		{

		}
		catch(IllegalStateException illegalStateException)
		{

		}
	}

	public static void closeFile()
	{
		if (sc != null)
			sc.close();
	}
}
