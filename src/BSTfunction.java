
public class BSTfunction extends Node {
	
	public Node createNewNode(int k)
	{
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}
	/*
	 * 1. Creating new node if there is no Binary Tree exists then
	 */
	public Node insert(Node node, int value)
	{
		if (node == null)
		{
			return createNewNode(value);
		}
		if(value < node.data)
		{
			node.left = insert(node.left,value);
		}
		else if (value > node.data)
		{
			node.right = insert(node.right,value);
		}
		return node;
		
	}
	
	/*
	 * 2. Method for printing the Binary Tree
	 */
	public void printBST(Node node)
	{
		if(node == null)
		{
			return;
		}
		printBST(node.left);
		System.out.print(node.data + " -> ");
		printBST(node.right);
	}

}
