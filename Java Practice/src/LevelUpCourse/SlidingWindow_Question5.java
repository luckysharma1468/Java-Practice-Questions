import java.util.*;

// Given an array of integers and integer K, return an arraylist containing maximum of 
// each and every subarray of size K.

// Sample Input 

// {1, 2, 3, 1, 4, 5, 2, 3, 6}

// 3

// Sample Output

// [3, 3, 4, 5, 5, 5, 6]


public class SlidingWindow_Question5{
	

	// T.C --> O(N + K) <--- N for traversing an array and 
	// K for finding the maximum in each subarray
	public static ArrayList<Integer> subarrayMax(int[] arr, int n, int k){

		ArrayList<Integer> result = new ArrayList<Integer>();

		Deque<Integer> deque = new LinkedList<Integer>();

		for(int i=0; i<n; i++){
			deque.addLast(arr[i]);

			if(deque.size() == k){
				int max = Integer.MIN_VALUE;
				
				// finding max in a deque
				for(Integer d: deque){
					max = max < d ? d : max;
				}

				result.add(max);
				deque.removeFirst();
			}
		}

		return result;

	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int k = 3;

		ArrayList<Integer> result = subarrayMax(arr, arr.length, k);

		System.out.println(result);
	}
}