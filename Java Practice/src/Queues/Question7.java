package Queues;

/*
 * Stacks Using Two Queues (Pop Efficient)
 * 
 * 1 - Push ---> O(n)
 * 
 * 2 - pop  ---> O(1)
 * 
 * -1 - Exit
 */

import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Queue<Integer> primary = new LinkedList<>();
		Queue<Integer> secondary = new LinkedList<>();
		
		while(scan.hasNext()) {
			String ch = scan.nextLine();
			
			if(ch.equals("-1")) {
				System.exit(0);
			}
			
			if(ch.length() == 1) {
				
				if(primary.isEmpty()) {
					System.out.println("Topmost element ---> " + -1);
					continue;
				}
				
				System.out.println("Topmost element --> " + primary.remove());
			}else {
				
				int value = Integer.parseInt(ch.split(" ")[1]);
				
				secondary.add(value);
				
				while(!primary.isEmpty()) {
					secondary.add(primary.remove());
				}
				
				Queue<Integer> temp = primary;
				primary = secondary;
				secondary = temp;
			}
		}
		
	}

}
