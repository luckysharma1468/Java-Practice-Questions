package Trees;

import java.util.*;

class BinaryTree2{
    private class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int size;

    BinaryTree2(){
        this.root = takeInputLevelOrder();
    }

    private Node takeInputLevelOrder(){

        Scanner scan = new Scanner(System.in);

        LinkedList<Node> queue = new LinkedList<>();

        int data = scan.nextInt();
        Node rootNode = new Node(data);

        queue.add(rootNode);

        int lc, rc;

        while(!queue.isEmpty()){
            Node node = queue.removeFirst();

            lc = scan.nextInt();
            rc = scan.nextInt();

            if(lc != -1){
                node.left = new Node(lc);
                queue.add(node.left);
            }

            if(rc != -1){
                node.right = new Node(rc);
                queue.add(node.right);
            }
        }

        return rootNode;
    }

    public void preOrder(){
        preOrder(this.root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.data + " ");
        preOrder(node.left);
    }

	public void levelOrder(){
		LinkedList<Node> queue = new LinkedList<>();

		queue.add(this.root);

		while(!queue.isEmpty()){
			int size = queue.size();

			while(size > 0){
				
				Node node = queue.removeFirst();

				if(size == 1){
					System.out.print(node.data + " ");
				}

				if(node.left != null){
					queue.add(node.left);
				}

				if(node.right != null){
					queue.add(node.right);
				}

				size--;
			}
		}
	}
}

public class main {
    public static void main(String args[]) {
        BinaryTree2 tree = new BinaryTree2();
        tree.levelOrder();
    }
}