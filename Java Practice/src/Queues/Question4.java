package Queues;

import java.util.*;

/*
 * Note : This solution not using queue as its a brute force approach implementation
 *
 * Time Complexity - > O(n2)
 */
/*
 * First Non-repeating character in stream of characters.
 */


public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		HashMap<Character, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		while(scan.hasNext()) {
			char ch = scan.nextLine().charAt(0);
			
			if((""+ch).length() == 0) {
				System.exit(0);
			}
			
			sb.append(ch);
			
			if(map.containsKey(ch)) {
				int v = map.get(ch);
				map.put(ch, v+1);
			}else {
				map.put(ch, 1);
			}
			
			
			boolean flag = true;
			
			for(int i=0; i<sb.length(); i++) {
				char temp = sb.charAt(i);
				
				if(map.get(temp) == 1) {
					flag = false;
					
					System.out.println("Output -> " + temp);
					break;
				}
			}
			
			if(flag) {
				System.out.println("Output -> " + -1);
			}
		}

	}

}
