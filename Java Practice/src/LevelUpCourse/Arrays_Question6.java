package LevelUpCourse;

import java.util.*;

// Sub-array Sort

// Given a array, we have to sort a smallest sub-array so that whole array become sorted.
// If the input array is already sorted then return [-1, 1] else return indices of start and end
// of the sub-array.
// Minimum input array will be of size - 2

// Sample output for the given test case - [5, 7]

public class Arrays_Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 8, 6, 7, 9, 10, 11};
		
		int n = arr.length;
		
		// Approach -1 
		// T.C -> O(NlogN)
		// S.C -> 0(N)
		
//		ArrayList<Integer> result = approach1(arr, n);
//		
//		System.out.println(result);
		
		
		// Approach - 2
		// T.C -> O(N)
		// S.C -> O(1)
		ArrayList<Integer> result = approach2(arr, n);
		
		System.out.println(result);

	}
	

	// 1. We make a copy of an orignal array and then sort that copy <- O(NlogN)
	// 2. We start comparing each element with the copy array by iterating forward (i)
	// and backward (j) .... we keep moving untill we found the different element in both the arrays
	// Those are our indices
	// When whole array is sorted means "i" reaches the end therefore we will return [-1, 1]
	
	public static ArrayList<Integer> approach1(int[] arr, int n) {
		int[] brr = new int[n];
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			brr[i] = arr[i];
		}
		
		Arrays.sort(brr);
		
		int i=0;
		
		while(i < n && arr[i] == brr[i])
		{
			i++;
		}
		
		int j = n-1;
		
		while(j>= 0 && arr[j] == brr[j]) {
			j--;
		}
		
		if(i==n) {
			result.add(-1);
			result.add(1);
			return result;
		}
		
		result.add(i);
		result.add(j);
		
		return result;
	}
	
	
	public static boolean outOfOrder(int[] arr, int i) {
		int x = arr[i];
		
		if(i == 0) {
			return x > arr[i+1];
		}
		
		if(i == arr.length-1) {
			return x < arr[i-1];
		}
		
		return x > arr[i+1] || x < arr[i-1];
	}
	
	
	// We will find the smallest and largest element which is out of order
	// Note - In an sorted array ---> graph is going upward
	
	// whereas we have to find the peaks and low points in an unsorted portion of an array
	
	// peaks like when current element is greater then both neighbouring element
	// low pont is when element is smaller than both neighbouring element
	
	public static ArrayList<Integer> approach2(int[] arr, int n) {
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int x = arr[i];
			
			if(outOfOrder(arr, i)) {
				smallest = Math.min(smallest, x);
				largest = Math.max(largest, x);
			}
			
		}
		
		if(smallest == Integer.MAX_VALUE) {
			result.add(-1);
			result.add(1);
			return result;
		}
		
		// Finding the correct position for the elements

		int left = 0;
		while(smallest >= arr[left]) {
			left++;
		}
		
		int right = arr.length-1;
		while(largest <= arr[right]) {
			right--;
		}
		
		result.add(left);
		result.add(right);
		
		return result;
		
	}
	
	

}
