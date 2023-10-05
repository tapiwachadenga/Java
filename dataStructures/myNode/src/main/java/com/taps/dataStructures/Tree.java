package com.taps.dataStructures;

public class Tree<T extends Comparable<T>>
{
	private TreeNode<T> root;

	public Tree()
	{
		root = null;
	}

	public Tree(T value)
	{
		root = new TreeNode<T>(value);
	}		

	public void insert(T value)
	{
		if (root == null)
			root = new TreeNode<T>(value);
		else
			root.insert(value);
	}

	public void preorderTraversal()
	{
		preorderHelper(root);
	}

	public void preorderHelper(TreeNode<T> node)
	{
		if (node == null)
			return;
		System.out.printf("%s ", node.data);
		preorderHelper(node.lNode);
		preorderHelper(node.rNode);
	}

	public void inorderTraversal()
	{
		inorderHelper(root);
	}

	public void inorderHelper(TreeNode<T> node)
	{
		if (node == null)
			return;
		inorderHelper(node.lNode);
		System.out.printf("%s ", node.data);
		inorderHelper(node.rNode);
	}
}
