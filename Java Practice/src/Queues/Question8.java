package Queues;

/*
 * Queue using two stacks (Enqueue efficient)
 * 
 * 1. Push -> O(1)
 * 2. Pop -> O(n)
 * 3. getFront() -> O(n)
 */

import java.util.*;

public class Question8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> primary = new Stack<>();
		Stack<Integer> secondary = new Stack<>();
		
		while(scan.hasNext()) {
			
			String ch = scan.nextLine();
			
			if(ch.equals("-1")) {
				System.exit(0);
			}
			
			if(ch.equals("4")) {
				System.out.println(primary);
			}
			else if(ch.length() == 1) {
				
				if(primary.isEmpty()) {
					System.out.println("Queue is Empty");
					continue;
				}
				
				while(primary.size() != 1) {
					secondary.push(primary.pop());
				}
				
				if(ch.equals("2")) {
					System.out.println("Removed ELement -> " + primary.pop());
				}else {
					System.out.println("Queue Front -> " + primary.peek());
				}
				
				while(!secondary.isEmpty()) {
					primary.push(secondary.pop());
				}
			}else{
				primary.push(Integer.parseInt(ch.split(" ")[1]));
			}
			
		}

	}

}
