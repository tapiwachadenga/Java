package com.taps.filesAndDirectory;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo
{
	public static void process() throws IOException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter file or directory name: ");

		Path path = Paths.get(input.nextLine());

		if(Files.exists(path))
		{
			System.out.printf("%n%s exists%n", path.getFileName());
			System.out.printf("%s a directory%n", Files.isDirectory(path) ? "Is" : "Is not");
			System.out.printf("%s an absolute path%n", path.isAbsolute() ? "Is" : "Is not");
			System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
			System.out.printf("Size: %s%n", Files.size(path));
			System.out.printf("Path: %s%n", path);
			System.out.printf("Absolute path: %s%n", path.toAbsolutePath());
			System.out.printf("\n");
		}

		if(Files.isDirectory(path))
		{	
			System.out.printf("%nDirectory contents%n");
			DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

			for (Path p: directoryStream)
			{
				System.out.println(p);
			}
		}

		else
		{
			System.out.printf("File: %s does not exist in Directory: %s%n", path, System.getProperty("user.dir"));
		}
	}
}
