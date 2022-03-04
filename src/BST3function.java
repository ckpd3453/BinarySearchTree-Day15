
public class BST3function extends Node3 {
	Node3 node;
	Node3 size = new Node3();
	int length = size.size(node);

	/*
	 * 1. Creating new node if there is no Binary Tree exists then
	 */
	public Node3 createNewNode(int k) {
		Node3 a = new Node3();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}

	/*
	 * 2. Method for inserting new sub nodes to Binary Tree as per their weight
	 */
	public Node3 insert(Node3 node, int value) {
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
	 *3.  Method to search for a given key value
	 */
	public Node3 search(Node3 node, int key) {
		// Base Cases: root is null or key is present at root
		if (node == null || node.data == key) {
			System.out.println(node.data + " is present in the Tree");
			return node;
		} else {
			// Key is greater than root's key
			if (node.data < key) {
				return search(node.right, key);
			} else {
				// Key is smaller than root's key
				return search(node.left, key);
			}
		}
	}

	/*
	 * 4. Method for printing the Binary Tree
	 */
	public void printBST(Node3 node) {
		if (node == null) {
			return;
		}
		printBST(node.left);
		System.out.print(node.data + " -> ");
		printBST(node.right);
	}

}
