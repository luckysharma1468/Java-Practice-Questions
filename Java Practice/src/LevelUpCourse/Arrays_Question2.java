package LevelUpCourse;

import java.util.*;

// Triplets 
// Given an array of N integers, Find a triplet of distinct integers whose sum equal to a target sum.
// Array can be sorted or unsorted
// Note -> Numbers in triplets should be in ascending order and triplets should also be in ascending order.
// If no triplet exists return an empty array.

public class Arrays_Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Taking sorted array in below approaches
		// If not sorted -> just sort the array and apply below approaches
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
		int sum = 18;
		
		// Approach - 1
		// T.C -> O(n3) --> Brute Force Approach
		// S.C -> O(1)
		
//		System.out.println(approach1(arr, sum));
		
		// Approach - 2 (Preferred)
		// T.C -> O(n2)
		// S.C -> O(1)
		
//		System.out.println(approach2(arr, sum));
		
		// Approach - 3
		// T.C -> O(n2)
		// S.C -> O(n)
		
		System.out.println(approach3(arr, sum));
		
	}
	
	
	// Using three loops to find the triplet
	public static ArrayList<ArrayList<Integer>> approach1(int[] arr, int sum){
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<arr.length; i++) {
				
			for(int j=i+1; j<arr.length; j++) {
				
				for(int k=j+1; k < arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == sum) {
						ArrayList<Integer> tempList = new ArrayList<>();
						tempList.add(arr[i]);
						tempList.add(arr[j]);
						tempList.add(arr[k]);
						result.add(tempList);
					}
				}
			}
		}
		
		return result;
	}
	
	
	// Fixing 1st element in every iteration
	// and using that element to find a newSum
	
	// a + b + c = SUM
	// a = arr[i] -> i = 0  to arr.length -1
	// b + c = SUM - a
	// Therefore b + c = newSUM <- problem reduce to Pair sum
	// Note :- Always use lower index = i+1
	
	public static ArrayList<ArrayList<Integer>> approach2(int[] arr, int sum){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<arr.length; i++) {
			int newSum = sum - arr[i];
			
			int j = i+1;
			int k = arr.length -1;
			
			while(j < k) {
				if(arr[j] + arr[k] == newSum) {
					ArrayList<Integer> tempList = new ArrayList<>();
					tempList.add(arr[i]);
					tempList.add(arr[j]);
					tempList.add(arr[k]);
					result.add(tempList);
					j++;
					k--;
				}
				else if (arr[j] + arr[k] > newSum) {
					k--;
				}
				else {
					j++;
				}
			}
		}
		
		return result;
	}
	
	// We are using everything same as approach 2 except not using two pointer approach to solve the Pair sum
	// We are using to set to solve the problem
	// which also increases the space time complexity of the question.
	
	public static ArrayList<ArrayList<Integer>> approach3(int[] arr, int sum){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<arr.length; i++) {
			int newSum = sum - arr[i];
			
			HashSet<Integer> set = new HashSet<>();
			
			for(int j=i+1; j<arr.length; j++) {
				
				int complement = newSum - arr[j];
				
				if(set.contains(complement)) {
					ArrayList<Integer> tempList = new ArrayList<>();
					tempList.add(arr[i]);
					tempList.add(complement);
					tempList.add(arr[j]);
					result.add(tempList);
				}
				
				set.add(arr[j]);
			}
		}
		
		return result;
	}
	

}
