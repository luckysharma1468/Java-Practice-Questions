package LevelUpCourse;

import java.util.*;

// Todo -> Find all the subarrays indicies whose sum is equal to the target sum.

// Sample Input 

// int[] arr = {1, 3, 2, 1, 4, 1, 3, 2, 1, 1, 2};

// Sample Output

// 2 5
// 4 6
// 5 9

public class SlidingWindow_Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 3, 2, 1, 4, 1, 3, 2, 1, 1, 2};
		
		int n = arr.length;
		
		int target = 8;
		
		// Approach 1 - Brute force approach
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
//		result.addAll(approach1(arr, n, target));
		
//		result.addAll(approach2(arr, n, target));
		
//		result.addAll(approach3(arr, n, target));
		
		result.addAll(approach4(arr, n, target));
		
		System.out.println(result);
		
	}
	
	
	// Brute Force Approach - 
	// T.C -> O( N3 )
	// Using three loops
	// First loop --> Finding the starting point of the array
	// second loop or inner loop ---> Finding the ending point of the array
	// third or inner most loop --> Finding the sum from start to end and if the sum is matched with the target
	// sum then store the indices in the array list.
	
	public static ArrayList<ArrayList<Integer>> approach1(int[] arr, int n, int target){
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<n; i++) { // starting point
			for(int j=i; j<n; j++) { // ending point
				
				int sum = 0;
				for(int k = i; k<=j; k++) { // traversing from start to end and summing the elements
					sum += arr[k];
				}
				
				if(sum == target) {
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(i);
					temp.add(j);
					
					result.add(temp);
				}
			}
		}
		
		return result;
	}
	
	// Approach -2 "Using Prefix sum to reduce the T.C"
	// As we need to find the subarray sum, so we use an extra space 
	// to use prefix sum as to calculate the subarray sum
	
	// i.e Now we can find the sum in O(1) time instead of O(N)
	// T.C -> O( N2 )
	// S.C -> O(N) <-- for storing prefix sum
	public static ArrayList<ArrayList<Integer>> approach2(int[] arr, int n, int target){
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		int[] PS = new int[n];
		int sum = 0;
		for(int i=0; i<n ; i++) {
			sum += arr[i];
			PS[i] = sum;
		}
		
		for(int i=0; i<n; i++) { // starting point
			for(int j=i; j<n; j++) { // ending point
				
				if(i> 0 && i != j) {
					sum = PS[j] - PS[i-1];
				}else {
					sum = arr[i];
				}
				
				if(sum == target) {
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(i);
					temp.add(j);
					
					result.add(temp);
				}
			}
		}
		
		return result;
		
	}
	
	
	// Approach - 3
	// To be validated
	// O(NLogN)
	public static ArrayList<ArrayList<Integer>> approach3(int[] arr, int n, int target){
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		int[] PS = new int[n];
		int sum = 0;
		for(int i=0; i<n ; i++) {
			sum += arr[i];
			PS[i] = sum;
		}
		
		for(int i=0; i<n; i++) {
			int comp = target + arr[i];
			
			int index = binarySearch(PS, 0, n-1, comp);
			System.out.println(comp + " " + index);
			if(index != -1) {
				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(i);
				temp.add(index);
				
				result.add(temp);
			}
		}
		
		return result;
	}
	
	public static int binarySearch(int[] arr, int start, int end, int x) {
		
		if(start <= end) {
			
			int mid = start + (end-start)/2;
			
			if(arr[mid] == x) {
				return mid;
			}
			
			if(arr[mid] > x)
				return binarySearch(arr, 0, mid-1, x);
			else 
				return binarySearch(arr, mid+1, end, x);			
		}
		
		return -1;
	}
	
	public static ArrayList<ArrayList<Integer>> approach4(int[] arr, int n, int target){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		int i =0; 
		int j = 0;
		
		while( i< n && j < n) {
			if(i != j) {
				if(arr[i] + arr[j] == target) {
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(i);
					temp.add(j);
					
					result.add(temp);
					i++;
					j++;
				}
				else if(arr[i] + arr[j] > target){
					i++;
				}else {
					j++;
				}
			}
			else if(arr[i] == target) {
				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(i);
				temp.add(j);
				
				result.add(temp);
				i++;
				j++;
			}else{
				j++;
			}
		}
		
		return result;
	}

}
