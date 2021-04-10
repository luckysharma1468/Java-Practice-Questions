package Queues;

import java.util.*;

/*
 * First Non-Repeating Character Queue Implementation
 * Time complexity  - >  O(n)
 */

public class Question5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<Character, Integer> map = new HashMap<>();
		Queue<Character>q = new LinkedList<>();
		
		while(scan.hasNext()) {
			char ch = scan.nextLine().charAt(0);
			
			if(ch == '$') {
				System.exit(0);
			}
			
			q.add(ch);
			
			if(map.containsKey(ch)) {
				int value = map.get(ch);
				map.put(ch, value+1);
			}else {
				map.put(ch, 1);
			}
			
			while(!q.isEmpty() && map.get(q.peek()) != 1) {
				q.remove();
			}
			
			if(!q.isEmpty()) {
				System.out.println("Output -> " + q.peek());
			}else {
				System.out.println("Output -> " + -1);
			}
			
		}

	}

}
