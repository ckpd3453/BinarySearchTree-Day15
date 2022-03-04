
public class BST3Driver {

	/**
	 * 
	 * @param args 
	 * UC-:-3.Ability to search 63 in the Binary Tree
	 * ===============================================
	 *   Procedure:- 
	 *   ========== 
	 *1. Creating object to access the function of function class 
	 *2. Creating an object of Node class to get size of Tree 
	 *3. Adding the sub-nodes of Binary Tree 
	 *4. Printing the elements of Binary Tree as shown in diagram 
	 *5. Getting size of the binary tree recursively
	 *6. Searching for given key value whether it is present or not
	 */

	public static void main(String[] args) {

		/*
		 * 1. Creating an object of function class
		 */
		BST3function link = new BST3function();

		/*
		 * 2.Creating an object of node class to get the size of tree
		 */
		Node3 size = new Node3();
		Node3 root = null;

		/*
		 * 3.Adding sub-nodes to the Binary Tree as per their weight
		 */
		root = link.insert(root, 56);
		root = link.insert(root, 30);
		root = link.insert(root, 70);
		root = link.insert(root, 22);
		root = link.insert(root, 40);
		root = link.insert(root, 60);
		root = link.insert(root, 95);
		root = link.insert(root, 11);
		root = link.insert(root, 65);
		root = link.insert(root, 3);
		root = link.insert(root, 16);
		root = link.insert(root, 63);
		root = link.insert(root, 67);

		/*
		 * 4.Printing the tree as given in the problems
		 */
		link.printBST(root);

		/*
		 * 5. Getting Size of the Tree
		 */
		int x = size.size(root);
		System.out.println("\nSize of Tree: " + x);
		
		/*
		 * 6. Searching for given key value whether it is present or not
		 */
		link.search(root, 63);
	}
}
