
public class Driver {

	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.add(new Node(50));
		b.add(new Node(25));
		b.add(new Node(10));
		b.add(new Node(40));
		b.add(new Node(35));
		b.add(new Node(45));
		b.add(new Node(75));
		b.add(new Node(60));
		b.add(new Node(55));
		b.add(new Node(80));
		b.print(b.head);
	}

}
