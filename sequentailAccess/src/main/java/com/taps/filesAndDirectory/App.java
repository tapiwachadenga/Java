package com.taps.filesAndDirectory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	String fn = "sequentailAccess/data/tapiwa.txt";
        WriteTextFile.writeTo(fn);
	ReadTextFile.ReadFrom(fn);
    }
}
