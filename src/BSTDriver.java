
public class BSTDriver {

	public static void main(String[] args) {
		BSTfunction link = new BSTfunction();
		Node root = null;
		
		root = link.insert(root, 56);
		root = link.insert(root, 30);
		root = link.insert(root, 70);
		link.printBST(root);

	}

}
