package Queues;

/*
 * Queue using two stacks --> Dequeue Efficient
 * 
 * 1. Enqueue -> O(n)
 * 
 * 2. Dequeue -> O(1)
 * 
 * 3. Front --> O(1)
 * 
 * 4. Display --> O(n)
 * 
 */

import java.util.*;

public class Question10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> primary = new Stack<>();
		Stack<Integer> secondary = new Stack<>();
		
		while(scan.hasNext()) {
			String ch = scan.nextLine();
			
			if(ch.equals("-1")) {
				System.exit(0);
			}
			
			if(ch.length() == 1) {
				
				if(primary.isEmpty()) {
					System.out.println("Queue is Empty, Please enqueue before Dequeue");
					continue;
				}
				
				if(ch.equals("2")) {
					System.out.println("Removed Element -> " + primary.pop());
				}else {
					System.out.println("Front Element -> " + primary.peek());
				}
			}else {
				
				while(!primary.isEmpty()) {
					secondary.push(primary.pop());
				}
				
				int element = Integer.parseInt(ch.split(" ")[1]);
				
				primary.push(element);
				
				while(!secondary.isEmpty()) {
					primary.push(secondary.pop());
				}
				
			}
			
		}
		
		scan.close();

	}

}
