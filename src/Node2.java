
public class Node2 {
	
	/*
	 * 1. Declaring the variables that are used as left node,right node,root node and
	 * data;
	 */
	int data;
	Node2 left;
	Node2 right;
	Node2 node;
	
	/*
	 * 2. Method to get the size of the Binary Tree
	 */
	public static int size(Node2 node) {
		return (size1(node));
	}

	private static int size1(Node2 node) {
		if (node == null)
			return (0);
		else {
			return (size(node.left) + 1 + size(node.right));
		}
	}

}
