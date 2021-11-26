package LevelUpCourse;

import java.util.Arrays;

// Arrays Products

// Given an array, we have to return a resultant array of same length
// but every index will contain the product of each element except the current index;
// Note - Resultant array space complexity is not considered in this case

// Output array for the given test case

// [120, 60, 40, 30, 24]

public class Arrays_Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] nums = {1, 2, 3, 4, 5};
		int n = nums.length;
		
		// Brute Force approach
		// T.C -> O(n2)
		// S.C -> O(1)
		
//		int[] result = approach1(nums, n);
		
		
		// Through Division method
		// T.C -> O(n)
		// S.C -> O(1)
		
//		int[] result = approach2(nums, n);
		
		
		// T.C -> O(n)
		// S.C -> O(n)
		
//		int[] result = approach3(nums, n);
		
		
		// T.C -> O(n)
		// S.C -> O(1)
		
		int[] result = approach4(nums, n);
		
		for(int i: result) {
			System.out.print(i + " ");
		}
		
	}
	
	
	// Simply iterate through each element and ignoring the current element
	// and storing it in the resultant array
	
	public static int[] approach1(int[] nums, int n) {
		
		int[] res = new int[n];
		Arrays.fill(res, 1);
		
		
		for(int i=0; i<n; i++) {
			
			for(int j= 0; j<n; j++) {
				if(i != j) {
					res[i] = res[i] * nums[j];
				}
			}
		}
		
		return res;
	}
	
	
	// First find the total mutiplication of an array then 
	// divide nums element at that particular index and store it in the resultant array.
	
	public static int[] approach2(int[] nums, int n) {
		int[] res = new int[n];
		
		int tmult = 1;
		for(int i=0; i<n; i++) {
			tmult *= nums[i];
		}
		
		for(int i=0; i<n; i++) {
			res[i] = tmult/nums[i];
		}
		
		return res;
	}
	
	// Store the Prefix product in left array
	// Store the suffix product in the right array
	// Resultant array will contain the res[i] = left[i] * right[i]
 	
	public static int[] approach3(int[] nums, int n) {
		int[] left = new int[n];
		int[] right = new int[n];
		int[] res = new int[n];
		
		left[0] = 1;
		
		for(int i=1; i<n; i++) {
			left[i] = left[i-1] * nums[i-1];
		}
		
		right[n-1] = 1;
		
		for(int i=n-2; i>=0; i--) {
			right[i] = right[i+1] * nums[i+1];
		}
		
		for(int i=0; i<n; i++) {
			res[i] = left[i] * right[i];
		}
		
		return res;
		
	}
	
	
	// Instead of storing the prefix and suffix product
	// we will directly calculate the running prefix and running suffix
	
	// For Prefix --> we first scan the array from the left side
	// For Suffix --> we then multify the prefix with suffix by scanning from right
	
	public static int[] approach4(int[] nums, int n) {
		int[] res = new int[n];
		
		int runningPrefix = 1;
		
		for(int i=0; i<n; i++) {
			res[i] = runningPrefix;
			runningPrefix *= nums[i];
		}
		
		int runningSuffix = 1;
		for(int i=n-1; i>=0; i--) {
			res[i] *= runningSuffix;
			runningSuffix *= nums[i];
		}
		
		return res;
	}

}
