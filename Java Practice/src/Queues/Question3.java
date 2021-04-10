package Queues;

import java.util.*;

/*
 * Maximum element in window of size k
 */

public class Question3 {

	public static void printMax(int[] arr, int k) {
		Deque<Integer> q = new LinkedList<>();
		
		int i;
		
		for(i=0; i<k; i++) {
			
			while(!q.isEmpty() && arr[i] > arr[q.getLast()]) {
				q.removeLast();
			}
			
			q.addLast(i);
		}
		
		for(; i<arr.length; i++) {
			
			System.out.println(arr[q.getFirst()] + " ");
			
			while(!q.isEmpty() && q.getFirst() <= i-k) {
				q.removeFirst();
			}
			
			while(!q.isEmpty() && arr[i] > arr[q.getLast()]) {
				q.removeLast();
			}
			
			q.addLast(i);
		}
		
		System.out.println(arr[q.getFirst()]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> deque = new LinkedList<>();
		
		int[] arr = {12, 1, 78, 90, 57, 89, 56};
		
		int k =3;
		
		printMax(arr, k);

	}

}
