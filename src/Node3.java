
public class Node3 {

	/*
	 * 1. Declaring the variables that are used as left node,right node,root node
	 * and data;
	 */
	int data;
	Node3 left;
	Node3 right;
	Node3 node;

	/*
	 * 2. Method to get the size of the Binary Tree
	 */
	public static int size(Node3 node) {
		return (size1(node));
	}

	private static int size1(Node3 node) {
		if (node == null)
			return (0);
		else {
			return (size(node.left) + 1 + size(node.right));
		}
	}

}
