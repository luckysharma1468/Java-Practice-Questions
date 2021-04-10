package Queues;

/*
 * Reversing a Queue using Recursion.
 */

import java.util.*;

public class Question9 {
	
	public static void reverseQueue(Queue<Integer> queue) {
		if(queue.isEmpty()) {
			return;
		}
		
		int element = queue.remove();
		reverseQueue(queue);
		queue.add(element);
	}
	
	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=5; i++) {
			queue.add(i);
		}
		
		System.out.println("Orignal Queue -> " + queue);
		reverseQueue(queue);
		System.out.println("Reversed Queue -> " + queue);

	}

}
