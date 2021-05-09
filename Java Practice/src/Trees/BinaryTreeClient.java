package Trees;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false 
		BinaryTree tree = new BinaryTree();
		tree.display();
		
		System.out.println("Height of a tree is " + tree.height());
		
		System.out.println("PreOrder traversal of a Binary Tree");
		
		tree.preOrder();
		
		System.out.println("InOrder traversal of a Binary Tree");
		
		tree.inOrder();
		
		System.out.println("PostOrder traversal of a Binary Tree");
		
		tree.postOrder();
		
		System.out.println("Level Order traversal of a Binary Tree");
		
		tree.levelOrder();
		
		System.out.println("Checking Given tree is BST or not ?");
		
		System.out.println(tree.isBST());
		
		System.out.println(tree.isBST2());
		
		System.out.println("Leaf Node sum " + tree.leafNodeSum());
	}

}
