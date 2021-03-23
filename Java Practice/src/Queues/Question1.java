package Queues;


/*
 * Circular Array Based Queue
 * 
 */

public class Question1 {

	private int[] arr;
	private int cs;
	private int ms;
	private int front;
	private int rear;
	
	private static int DEFAULT_CAPACITY = 10;
	
	public Question1() {
		this(DEFAULT_CAPACITY);
	}
	
	public Question1(int capacity) {
		this.arr = new int[capacity];
		this.cs = 0;
		this.ms = capacity;
		this.front = 0;
		this.rear = capacity - 1;
	}
	
	
	public boolean isFull() {
		return this.cs == this.ms;
	}
	
	public boolean isEmpty() {
		return this.cs == 0;
	}
	
	public int getFront() {
		return this.arr[this.front];
	}
	
	public void enqueue(int data) {
		if(!isFull()) {
			this.rear = (this.rear + 1)%this.ms;
			this.arr[this.rear] = data;
			this.cs = this.cs + 1;
		}
	}
	
	public void dequeue() {
		if(!isEmpty()) {
			this.front = (this.front+1)%this.ms;
			this.cs = this.cs - 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question1 queue = new Question1(7);
		
		for(int i=1; i<8; i++) {
			queue.enqueue(i);
		}
		
		queue.dequeue();
		queue.dequeue();
		
		while(!queue.isEmpty()) {
			System.out.println(queue.getFront());
			queue.dequeue();
		}
		
		
		
	}

}
