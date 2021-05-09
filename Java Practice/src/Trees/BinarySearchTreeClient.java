package Trees;

public class BinarySearchTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] in = {10, 20, 30, 40, 50, 60, 70};
		
		BinarySearchTree tree = new BinarySearchTree(in);
		tree.display();
		
		System.out.println(tree.search(30));
		
		System.out.println("Max in this BST " + tree.max() );
		
//		System.out.println("Adding 65");
//		
//		tree.add2(65);
//		
//		tree.display();
//		
//		System.out.println("Adding 12");
//		
//		tree.add(12);
//		
//		tree.display();
		
		tree.remove(40);
		tree.display();
		

	}

}
