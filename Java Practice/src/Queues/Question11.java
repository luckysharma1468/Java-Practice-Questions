package Queues;

/*
 * Stack using two Queues (2nd Approach -> Without changing references)
 * 
 * 1. Push
 * 2. Pop
 * 3. Get Front
 * 4. Display
 */

import java.util.*;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Queue<Integer> primary = new LinkedList<>();
		Queue<Integer> secondary = new LinkedList<>();

		while(scan.hasNext()) {
			String ch = scan.nextLine();
			
			if(ch.equals("-1")) {
				System.exit(0);
			}
			
			if(ch.equals("4")) {
				System.out.println(primary);
			
			}else if()
		}
	}

}
