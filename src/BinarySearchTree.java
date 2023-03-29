
public class BinarySearchTree {
	
	private int size;
	public Node head;
	
	public BinarySearchTree() {
		head = null;
		size = 0;
	}
	
	public void add(Node n) {
		if (head == null) head = n;
		Node curr = head;
		while (curr.left != null || curr.right != null) {
			if (n.getData() < curr.getData() && curr.left != null) curr = curr.left;
			else if (n.getData() > curr.getData() && curr.right != null) curr = curr.right;
			else break;
		} if (n.getData() < curr.getData()) curr.left = n;
		else if (n.getData() > curr.getData()) curr.right = n;
	}
	
	public void print(Node n) {
		if (n != null) {
			print(n.left);
			System.out.print(n.getData() + " ");
			print(n.right);
		}
	}
	
	public void rotateLeft(Node n) {
		//n.right.left = n
		//.right = n.right.left
		//n.parent.left = n.right
	}
}
