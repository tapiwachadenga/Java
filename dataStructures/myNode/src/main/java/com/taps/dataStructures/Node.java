package com.taps.dataStructures;

class Node<T>
{
	private T data;
	private Node<T> nextNode;

	public Node(T data)
	{
		this(data, null);	
	}

	public Node(T data, Node<T> nextNode)
	{
		this.data = data;
		this.nextNode = nextNode;
	}

	public void setData(T data)
	{
		this.data = data;
	}

	public T getData()
	{
		return this.data;
	}

	public void setNext(Node<T> nextNode)
	{
		this.nextNode = nextNode;
	}

	public Node<T> getNext()
	{
		return nextNode;
	}

	@Override
	public String toString()
	{
		return String.format("Node [ data: %s; nextNode: %s]", data, nextNode);
	}
}
