package Trees;

import java.util.*;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root = null;
	private int size = 0;

	BinaryTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isLeftOrRight) {
		if (parent == null) {
			System.out.println("Enter the data for root node");
		} else {

			if (isLeftOrRight) {
				System.out.println("Enter the data for Left child of parent " + parent.data);
			} else {
				System.out.println("Enter the data for right child of parent " + parent.data);
			}
		}

		int nodeData = s.nextInt();
		Node node = new Node(nodeData, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do " + node.data + " have left child ?");
		choice = s.nextBoolean();

		if (choice) {
			node.left = this.takeInput(s, node, true);
		}

		choice = false;
		System.out.println("Do " + node.data + " have right child ?");
		choice = s.nextBoolean();

		if (choice) {
			node.right = this.takeInput(s, node, false);
		}

		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		String str = "";

		if (node.left != null) {
			str += node.left.data + " => ";
		} else {
			str += "END =>";
		}

		str += " " + node.data;

		if (node.right != null) {
			str += " => " + node.right.data;
		} else {
			str += " => END";
		}

		System.out.println(str);

		if (node.left != null) {
			this.display(node.left);
		}

		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {

		if (node == null) {
			return -1;
		}

		int lheight = this.height(node.left);
		int rheight = this.height(node.right);

		int height = Math.max(lheight, rheight) + 1;

		return height;
	}

	public void preOrder() {
		this.preOrder(this.root);
		System.out.println("END");
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + ", ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void inOrder() {
		this.inOrder(this.root);
		System.out.println("END");
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.data + ", ");
		inOrder(node.right);
	}

	public void postOrder() {
		this.postOrder(this.root);
		System.out.println("END");
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + ", ");
	}

	public void levelOrder() {
		this.levelOrder(this.root);
	}

	private void levelOrder(Node node) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(node);

		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();

			System.out.print(rn.data + ", ");

			if (rn.left != null) {
				queue.add(rn.left);
			}

			if (rn.right != null) {
				queue.add(rn.right);
			}
		}

		System.out.println("END");
	}

	private ArrayList<Integer> list = new ArrayList<>();

	public void modifiedInOrder() {
		this.modifiedInOrder(this.root);
	}

	private void modifiedInOrder(Node node) {
		if (node == null) {
			return;
		}

		modifiedInOrder(node.left);
		this.list.add(node.data);
		modifiedInOrder(node.right);

	}

	public boolean isBST() {
		this.modifiedInOrder();

		return isSorted(this.list, 0);
	}

	private boolean isSorted(ArrayList<Integer> list, int index) {
		if (index == list.size() - 1) {
			return true;
		}

		if (list.get(index) > list.get(index + 1)) {
			return false;
		}

		return isSorted(list, index + 1);
	}

	public boolean isBST2() {
		return isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBST(Node node, int min, int max) {
		if (node == null) {
			return true;
		}

		if (node.data > max || node.data < min) {
			return false;
		} else if (!isBST(node.left, min, node.data)) {
			return false;
		} else if (!isBST(node.right, node.data, max)) {
			return false;
		}

		return true;
	}

	public int leafNodeSum() {
		return leafNodeSum(this.root);
	}

	public int leafNodeSum(Node node) {

		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return node.data;
		}

		int lSubtree = leafNodeSum(node.left);
		int rSubtree = leafNodeSum(node.right);

		return lSubtree + rSubtree;
	}
}
