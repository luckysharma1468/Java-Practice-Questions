import java.util.*;

// ***** Inserting in a middle in Linked List ******

public class LinkedList_Question2{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtHead(30);
		list.insertAtHead(20);
		list.insertAtHead(10);
		list.insertInMiddle(100, 2);
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

	Node head;

	LinkedList(){
		head = null;
	}

	public  void insertAtHead(int data){
		if(head == null){
			Node nn = new Node(data, null);
			head = nn;
			return;
		}

		Node nn = new Node(data, null);
		nn.next = head;
		head = nn;
	}

	public void insertInMiddle(int data, int pos){
		if(pos == 0){
			insertAtHead(data);
			return;
		}

		Node temp = head;
		for(int jumps=1; jumps<=pos-1; jumps++){
			temp = temp.next;
		}

		Node nn = new Node(data,  null);
		nn.next = temp.next;
		temp.next = nn;
	}


	public void printLL(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}