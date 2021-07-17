package LevelUpCourse;

import java.util.Arrays;
import java.util.HashSet;

// Pairs Code

// Given an array -> we have to find a pair of "distinct integers" to make a target Sum
// Note : Given Array will atleast contain one pair

public class Arrays_Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 2, 3, -6, 9, 11};
		int sum = 4;
		
		// Approach - 1 ( Brute Force Approach)
		// T.C -> O(n2) 
		// S.C -> O(1)
		
//		approach1(arr, sum);
		
		// Approach - 2
		// T.C -> O(nlogn)
		// S.C -> O(1)
		
//		approach2(arr, sum);
		
		// Approach - 3
		// T.C -> O(nlogn)
		// S.C -> O(1)
		
//		approach3(arr, sum);
		
		// Approach - 4
		// T.C -> O(n)
		// S.C -> O(n)
		
		approach4(arr, sum);

	}
	
	// function will use two loops to find a pair
	public static void approach1(int[] arr, int sum) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] + arr[j] == sum) {
					System.out.println("[" + arr[i] + ", " + arr[j] + "]");
				}
			}
		}
	}
	
	
	// 1. Sort the array
	// 2. Two pointer approach to find a pair -> i = 0 and j = arr.length -1 
	public static void approach2(int[] arr, int sum) {
		
		Arrays.sort(arr);
		
		int i = 0;
		int j = arr.length -1;
		
		while(i < j) {
			if(arr[i] + arr[j] == sum) {
				System.out.println("[" + arr[i] + ", " + arr[j] + "]");
				i++;
				j--;
			}
			else if(arr[i] + arr[j] > sum) {
				j--;
			}
			else {
				i++;
			}
		}
		
	}
	
	
	// 1. Sort the Array
	// 2. Using Binary search to find a complement number
	
	// complement number will be --> a + b = sum
	// a = arr[i] Here i -> 0 to arr.length -1
	// sum = Given
	
	// if arr[i] > 0
	// b (complement Number)  = sum - arr[i]
	// else
	// b = sum + arr[i]
	
	public static void approach3(int[] arr, int sum) {
		
		Arrays.sort(arr);
		
		for(int i= 0; i< arr.length; i++) {
			
			int	num = sum - arr[i]; 
			
			int index = binarySearch(arr,0, arr.length, num);
			
			if(index != -1 && arr[index] != arr[i]) {
				System.out.println("[" + arr[i] + ", " + arr[index] + "]");
			}
		}
	}
	
	public static int binarySearch(int[] arr, int low, int high, int num) {
		if(high >= low) {
			
			int mid = low + (high - low)/2;
			
			if(arr[mid] == num) {
				return mid;
			}
			
			if(arr[mid] > num) {
				return binarySearch(arr, low, mid-1, num);
			}
			
			return binarySearch(arr, mid+1, high, num);
		}
		
		return -1;
	}
	
	
	// 1. Using Set data structure
	// 2. Adding elements in set along the way of searching a complement number (complement number defined above)
	
	// Reason to use set data structure
	// Lookup time decrease to O(1) while in binary search its lookup time is O(logn)
	public static void approach4(int[] arr, int sum) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			
			int	num = sum - arr[i]; 
		
			if(set.contains(num) && num != arr[i]) {
				System.out.println("[" + arr[i] + ", " + num + "]");
			}
			
			set.add(arr[i]);
		}
	}

}
