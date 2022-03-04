
public class BST2function extends Node2 {
	Node2 node;

	/*
	 * 1. Creating new node if there is no Binary Tree exists then
	 */
	public Node2 createNewNode(int k) {
		Node2 a = new Node2();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}

	/*
	 * 2. Method for inserting new sub nodes to Binary Tree as per their weight
	 */
	public Node2 insert(Node2 node, int value) {
		if (node == null) {
			return createNewNode(value);
		}
		if (value < node.data) {
			node.left = insert(node.left, value);
		} else if (value > node.data) {
			node.right = insert(node.right, value);
		}
		return node;

	}
	
	/*
	 * 3. Method for printing the Binary Tree 
	 */
	public void printBST(Node2 node) {
		if (node == null) {
			return;
		}
		printBST(node.left);
		System.out.print(node.data + " -> ");
		printBST(node.right);
	}

}
