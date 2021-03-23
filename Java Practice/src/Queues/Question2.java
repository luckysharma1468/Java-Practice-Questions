package Queues;

import java.util.LinkedList;

/*
 * Linked List based Queue Implementation
 */

public class Question2 {
	
	private LinkedList<Integer> queue;
	
	public Question2() {
		queue = new LinkedList<>();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public void enqueue(int data) {
		queue.addLast(data);
	}
	
	public void deqeue() {
		queue.removeFirst();
	}
	
	public int getFront() {
		return queue.getFirst();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question2 Queue = new Question2();
		
		for(int i=1; i<=7; i++) {
			Queue.enqueue(i);
		}
		
		Queue.deqeue();
		Queue.deqeue();
		
		while(!Queue.isEmpty()) {
			System.out.println(Queue.getFront());
			Queue.deqeue();
		}
		
	}

}
