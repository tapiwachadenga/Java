package com.taps.dataStructures;

public class ListOfNodes<T>
{
	private Node<T> fstNode;
	private Node<T> lstNode;
	private String name;

	public ListOfNodes()
	{
		this("List");
	}

	public ListOfNodes(String name)
	{
		this.name = name;
		fstNode = lstNode = null;
	}

	public boolean isEmpty()
	{
		return fstNode == null;
	}

	public void insertFst(T element)
	{
		if (isEmpty())
			fstNode = lstNode = new Node<T>(element);	
		else
			fstNode = new Node<T>(element, fstNode);
	}

	public void insertLst(T element)
	{
		if (isEmpty())
			fstNode = lstNode = new Node<T>(element);
		else
			lstNode.setNext( new Node<T>(element) );	
	}

	public Node<T> deleteFst()
	{
		if(isEmpty())
			return new Node<T>(null);

		Node<T> removedNode = fstNode;

		if (fstNode == lstNode)
			fstNode = lstNode = null;
		else
			fstNode = fstNode.getNext();

		return removedNode;
	}

	public Node<T> deleteLst()
	{
		if (isEmpty())
			return null;
		
		Node<T> removedNode = lstNode;

		if (fstNode == lstNode)
			fstNode = lstNode = null;
		else
		{
			Node<T> crtNode = fstNode;

			while(crtNode != lstNode)
				crtNode = crtNode.getNext();

			lstNode = crtNode;
			crtNode.setNext(null);
		}
					
		return removedNode;
	}

	public int numberOfNodes()
	{
	
		if (fstNode == null)
			return 0;
		

		// Node<T> crtNode = fstNode;
		int cnt = 0;

		for (Node<T> crtNode = fstNode; crtNode != null; crtNode = crtNode.getNext())
		{
			cnt++;
			//crtNode = crtNode.getNext();
		}

		return cnt;
	}

	@Override
	public String toString()
	{
		if (isEmpty())
			return String.format("\n%s [ ]\n\n", name);

		String result = " ";

		Node<T> crtNode = fstNode;

		while (crtNode != null)
		{
			result += String.valueOf(crtNode.getData()) + " ";
			crtNode = crtNode.getNext();
		}

		return String.format("%s [%s]", name, result);
	}
}
