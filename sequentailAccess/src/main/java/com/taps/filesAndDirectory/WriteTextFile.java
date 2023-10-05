package com.taps.filesAndDirectory;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WriteTextFile
{
	public static Formatter output;

	public static void writeTo(String fileName)
	{
		openFile(fileName);
		addRecords();
		closeFile();
	}

	public static void openFile(String fn)
	{
		try
		{
			output = new Formatter(fn);
		}
		catch(SecurityException securityException)
		{
			System.err.println("Write permission denied. Terminating.");
			System.exit(1);
		}
		catch(FileNotFoundException fileNotFoundException)
		{
                        System.err.println("Error opening file. Terminating.");
                        System.exit(1);
		}
	}

	public static void addRecords()
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s%n%s%n> ", 
				"Enter Account number, first name, second name and balance.",
				"Enter end-of-file indicator to end input.");

		while(sc.hasNext())
		{
			try
			{
				output.format("%d %s %s %.2f%n", sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
			}
			catch(FormatterClosedException formatterClosedException)
			{
				System.err.println("Error writing file. Terminating.");
				break;
			}
			catch(NoSuchElementException noSuchElementException)
			{
				 System.err.println("Invalid input. Please try again.");
				 sc.nextLine();
			}

			System.out.print("> ");
		}
	}

	public static void closeFile()
	{
		if (output != null)
			output.close();
	}			
}

