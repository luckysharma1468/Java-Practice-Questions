package stacks;

import java.util.*;


/*
 * Program for next Greater element
 * Using Stacks
 * we can do this program in O(n) time.
 */

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 1, 4, 5, 4, 3 };
		
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i=0; i<arr.length; i++) {
			
			while(!stack.isEmpty() && arr[i] >= stack.peek()) {
				int rv = stack.pop();
				System.out.println(rv + "-->" + arr[i]);
			}
			
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			int rv = stack.pop();
			System.out.println(rv + "-->" + "-1");
		}

	}

}
