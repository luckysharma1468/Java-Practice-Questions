package GenericsClass;

public class GenericLinkedList <T> {

	private class Node {
		T data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void display() {
		Node temp = this.head;

		System.out.println("--------------------");

		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}

		System.out.println(". ");

		System.out.println("--------------------");
	}

	public void addLast(T item) {

		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (this.size >= 1) {
			this.tail.next = nn;
		}

		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}

	public void addFirst(T item) {

		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (this.size >= 1) {
			nn.next = head;
		}

		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}

	public T getFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}

		return this.head.data;
	}

	public T getLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}

		return this.tail.data;
	}

	public T getAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}

		Node temp = this.head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	private Node getNodeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}

		Node temp = this.head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public void addAt(T item, int idx) throws Exception {

		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid Index");
		}

		if (idx == 0) {
			addFirst(item);
		} else if (idx == this.size) {
			addLast(item);
		} else {
			
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
			
			Node prev = getNodeAt(idx-1);
			Node nextNode = prev.next;
			
			prev.next = nn;
			nn.next = nextNode;
			
			this.size++;
		}
	}
	
	public T removeFirst() throws Exception {
		
		if(this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		
		T rv = this.head.data;
		
		if(this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		}else {
			head = head.next;
			this.size--;
		}
		
		return rv;
		
	}
	
	public T removeLast() throws Exception{
		
		if(this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		
		T rv = this.tail.data;
		
		if(this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		}else {
			
			Node slast = getNodeAt(this.size-2);
			slast.next = null;
			this.tail = slast;
			this.size--;
			
		}
		
		return rv;
	}
	
	public T removeAt(int idx) throws Exception{
		if(this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		
		if(idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		
		if(idx == 0) {
			return removeFirst();
		}else if(idx == this.size-1) {
			return removeLast();
		}else {
			Node prev = getNodeAt(idx -1);
			Node curr = prev.next;
			Node nextNode = curr.next;
			
			T rv = curr.data;
			
			prev.next = nextNode;
			
			this.size--;
			
			return rv;
		}
	}
	
	
	public void reverseData() throws Exception{
		
		if(this.size == 0) {
			throw new Exception("LinkedList is empty");
		}
		
		int left = 0;
		int right = this.size -1;
		
		while(left < right) {
			
			Node LNode = getNodeAt(left);
			Node RNode = getNodeAt(right);
			
			T temp = LNode.data;
			LNode.data = RNode.data;
			RNode.data = temp;
			
			left++;
			right--;
		}
	}
	
	public void reversePointers() throws Exception{
		
		if(this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		
		Node prev = this.head;
		Node curr = prev.next;
		
		while(curr != null) {
			
			Node nextNode = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = nextNode;
			
		}
		
		Node t = this.head;
		this.head = this.tail;
		this.tail = t;
		
		this.tail.next = null;
		
	}
	
	//In One Traversal & without using size variable
	
	public T getMid() {
		
		Node slow = this.head;
		Node fast = this.head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
	}
	
	public int find(T data) {
		int index = 0;
		
		for(Node temp = this.head; temp != null ; temp = temp.next) {
			if(temp.data.equals(data)) {
				return index;
			}
			
			index++;
		}
		
		return -1;
	}
	
}
