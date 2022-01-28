import java.util.*;

// ***** Creating a Linked List ******

public class LinkedList_Question1{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtHead(30);
		list.insertAtHead(20);
		list.insertAtHead(10);

		list.printLL();
	}
}

class Node{
	int data;
	Node next;

	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
}

class LinkedList{

	static Node head;

	LinkedList(){
		head = null;
	}

	public static void insertAtHead(int data){
		if(head == null){
			Node nn = new Node(data, null);
			head = nn;
			return;
		}

		Node nn = new Node(data, null);
		nn.next = head;
		head = nn;
	}


	public static void printLL(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}