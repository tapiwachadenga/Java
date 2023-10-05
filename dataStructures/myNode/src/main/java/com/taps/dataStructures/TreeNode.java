package com.taps.dataStructures;

public class TreeNode<T extends Comparable<T>> 
{
	TreeNode<T> lNode;
	TreeNode<T> rNode;
	T data;

	public TreeNode(T data)
	{
		this.data = data;
		lNode = rNode = null;
	}

	public void insert(T value)
	{
		if(value.compareTo(data) < 0)
		{
			if(lNode == null)
				lNode = new TreeNode<T>(value);
			else 
				lNode.insert(value);
		}
		else  
		{
			if(rNode == null)
				rNode = new TreeNode<T>(value);
			else
				rNode.insert(value);
		}
	}
}
