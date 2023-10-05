package com.taps.dataStructures;

/**
 * Hello world!
 *
 */

import java.security.SecureRandom;

public class App 
{
    public static void main( String[] args )
    {
/**	    
        System.out.println( "Hello World!" );

	Node<Integer> n1 = new Node(9);
	Node<Integer> n2 = new Node(88);
	Node<Integer> n3 = new Node(777);
	Node<Integer> n4 = new Node(5555);
	n3.setNext(n4);
	n2.setNext(n3);
	n1.setNext(n2);

	ListOfNodes<Integer> lon = new ListOfNodes<Integer>("Taps' List");
	// System.out.printf("\n%s\n\n", lon);
	lon.insertFst(3);
	lon.insertLst(1);
	lon.insertFst(4);
	lon.insertLst(2);
	lon.insertFst(12);
	//lon.insertLst(34);
	System.out.printf("\n%s\n\n", lon.numberOfNodes());
	System.out.printf("\n%s\n\n", lon);
	lon.deleteFst();
	lon.deleteLst();
	System.out.printf("\n%s\n\n", lon.numberOfNodes());
	System.out.printf("\n%s\n\n", lon);
**/

	Tree<Integer> tree = new Tree<Integer>();

	SecureRandom sr = new SecureRandom();
	SecureRandom num = new SecureRandom();

	System.out.println("Inserting the following values:");

	for (int i = 0; i < num.nextInt(15); i++)
	{
		int value = sr.nextInt(50);
		System.out.printf("%d ", value);
		tree.insert(value);
	}


	System.out.println("\n\nPreorder traversal: ");
	tree.preorderTraversal();
	
	System.out.println("\n\nInorder traversal: ");
	tree.inorderTraversal();
	System.out.println();
    }
}
