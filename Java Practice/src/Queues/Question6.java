package Queues;

/*
 *	Stacks Using Two Queues (Push Efficient)
 *
 *	1 --> Push --> O(1)
 *
 *	2 --> Pop --> O(n)
 *
 *	-1 --> Exit
 * 
 */

import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Queue<Integer> primary = new LinkedList<>();
		Queue<Integer> secondary = new LinkedList<>();
		
		while(scan.hasNext()) {
			String s = scan.nextLine();
			
			if(s.equals("-1")) {
				System.exit(0);
			}
			
			if(s.length() == 1) {
				
				if(primary.isEmpty()) {
					System.out.println("-1");
					continue;
				}
				
				while(primary.size() != 1) {
					secondary.add(primary.remove());
				}
				
				System.out.println("Top Element -> " + primary.remove());
				
				Queue<Integer> temp = primary;
				primary = secondary;
				secondary = temp;
								
			}else {
				
				String[] arr = s.split(" ");
				primary.add(Integer.parseInt(arr[1]));

			}
		}

	}

}
