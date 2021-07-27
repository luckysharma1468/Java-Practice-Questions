package LevelUpCourse;

import java.util.Arrays;
import java.util.HashSet;

// Longest Band

// Given a array of N integers, we have to find the longest subsequence in which after reordering the elements in a
// consecutive fashion (absolute difference between neighboring elements is 1)

// That longest Subsequence can be called as band

// Array can be unsorted or sorted --> we are taking unsorted in this case.

// Given Array -> int[] arr = {1, 9, 3, 0, 18, 5, 2, 4, 10, 7, 12, 6};

// Output -> 8


public class Arrays_Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 9, 3, 0, 18, 5, 2, 4, 10, 7, 12, 6};
		int n = arr.length;
		
		// Approach - 1
		// T.C -> O(nlogn) 
		// S.C -> O(1)
		
//		System.out.println(approach1(arr, n));
		
		// Approach - 2
		// T.C -> O(n)
		// S.C -> O(n)
		
		System.out.println(approach2(arr, n));
	}
	
	
	// 1. Sorting the Array.
	// 2. Then we will linearly iterating the array and find the longest band accordingly.
	public static int approach1(int[] arr, int n) {
		
		Arrays.sort(arr);
		
		int longestBand = Integer.MIN_VALUE;
		int count = 0;
		
		for(int i=0; i<n; i++) {
			
			if(i+1 < n && (arr[i+1] - arr[i] == 1) ) {
				count++;
			}
			else {
				count++;
				
				if(longestBand < count) {
					longestBand = count;
				}
				
				count = 0;
			}
		}
		
		return longestBand;
		
	}
	
	
	
	// We will insert each element to a set first
	// Then we traverse an array linearly and checks whether the current element is a band head or not
	// Band head -> its previous element is not present in the array, example -> For element = 0,
	// -1 is not present in the array so 0 will be the band head.
	// If the current element is a band head, we will find the length of the band
	// otherwise we will ignore that element and move forward to check other elements.
	public static int approach2(int[] arr, int n) {
		
		int longestBand = Integer.MIN_VALUE;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i: arr) {
			set.add(i);
		}
		
		for(int i: arr) {
			
			if(!set.contains(i-1)) {
				int element = i;
				int count = 0;
				
				while(set.contains(element)) {
					element++;
					count++;
				}
				
				if(longestBand < count) {
					longestBand = count;
				}
				
			}
		}
		
		return longestBand;
		
	}

}
