package Trees;

public class BinarySearchTree {

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

	private Node root;

	BinarySearchTree(int[] arr) {
		this.root = constructBST(arr, 0, arr.length - 1);
	}

	private Node constructBST(int[] arr, int low, int high) {

		if (low > high) {
			return null;
		}

		int mid = (low + high) / 2;

		int data = arr[mid];

		Node node = new Node(data, null, null);

		node.left = constructBST(arr, low, mid - 1);
		node.right = constructBST(arr, mid + 1, high);

		return node;
	}

	public void display() {
		System.out.println("\n---------------------\n");
		display(this.root);
		System.out.println("\n---------------------\n");
	}

	private void display(Node node) {

		if (node == null) {
			return;
		}

		String str = "";

		if (node.left == null) {
			str += "null";
		} else {
			str += node.left.data;
		}

		str += " => " + node.data + " <= ";

		if (node.right == null) {
			str += "null";
		} else {
			str += node.right.data;
		}

		System.out.println(str);

		display(node.left);
		display(node.right);
	}

	public boolean search(int item) {
		return search(this.root, item);
	}

	private boolean search(Node node, int item) {

		if (node == null) {
			return false;
		}

		if (item > node.data) {
			return search(node.right, item);
		} else if (item < node.data) {
			return search(node.left, item);
		} else {
			return true;
		}
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {

		if (node.right == null) {
			return node.data;
		}

		return max(node.right);
	}

	public void add(int item) {
		this.root = add(this.root, item);
	}

	private Node add(Node node, int item) {

		if (node == null) {
			Node newNode = new Node(item, null, null);
			return newNode;
		}

		if (item > node.data) {
			node.right = add(node.right, item);
		} else {
			node.left = add(node.left, item);
		}

		return node;
	}

	public void add2(int item) {
		add(this.root, item);
	}

	private void add2(Node node, int item) {

		if (item > node.data) {
			if (node.right == null) {
				Node newNode = new Node(item, null, null);

				node.right = newNode;
			} else {
				add2(node.right, item);
			}
		} else {

			if (node.left == null) {
				Node newNode = new Node(item, null, null);

				node.left = newNode;
			} else {
				add2(node.left, item);
			}
		}
	}

	public void remove(int item) {
		remove(this.root, null, false, item);
	}

	public void remove(Node node, Node parent, boolean ilc, int item) {
		
		if(node == null) {
			return;
		}
		
		if(item > node.data) {
			remove(node.right, node, false, item);
		}else if(item < node.data) {
			remove(node.left, node, true, item);
		}else {
			
			if(node.left == null && node.right == null) {
				if(ilc) {
					parent.left = null;
				}else {
					parent.right = null;
				}
			}else if(node.left == null && node.right != null) {
				if(ilc) {
					parent.left = node.right;
				}else {
					parent.right = node.right;
				}
			}else if(node.left != null && node.right == null) {
				if(ilc) {
					parent.left = node.left;
				}else {
					parent.right = node.left;
				}
			}else {
				int max = max(node.left);
				node.data = max;
				
				remove(node.left, node, true, max);
			}
		}
	}

}
