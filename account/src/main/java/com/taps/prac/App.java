package com.taps.prac;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Account acc = new Account("Tapiwa Chadenga", 10000000.00);
	System.out.println(acc);
	System.out.printf("\ndeposit $67.89\n");
	acc.deposit(67.89);
	System.out.println(acc);
	System.out.println("\nwithdraw $0.89\n");
	acc.withdraw(0.89);
	System.out.println(acc);
	acc.setName("2Pac Shaque");
	System.out.println("\nchange acc name to 2Pac Shaque\n");
	System.out.println(acc);
    }
}
