import java.util.*;

// ***** Reversing a LinkedList ******

public class LinkedList_Question3{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// Inserting the elements in the linkedList
		list.insertAtHead(30);
		list.insertAtHead(20);
		list.insertAtHead(10);

		// Inserting the element in the second position
		list.insertInMiddle(100, 2);
		list.printLL();

		// Reverse a linkedList using recursion
		list.head = list.reverseLinkedListUsingRecursion(list.head);
		list.printLL();

		// Reverse a linkedList using Iterative Approach
		list.head = list.reverseLinkedListUsingIterative(list.head);
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

	public Node reverseLinkedListUsingRecursion(Node node){

		// Base Case
		if(node == null || node.next == null)
		{	
			return node;
		}
		
		// Recursive Case
		Node secondHead = reverseLinkedListUsingRecursion(node.next);
		node.next.next = node;
		node.next = null;

		return secondHead;

	}

	public Node reverseLinkedListUsingIterative(Node node){

		// Initilization
		Node prev = null;
		Node current = node;
		Node nextNode = null;

		while(current != null){
			nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}

		return prev;
	}

	public void printLL(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}