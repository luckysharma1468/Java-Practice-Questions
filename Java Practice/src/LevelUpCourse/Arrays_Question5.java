package LevelUpCourse;


// Rains Code

// Given an array of N non-negative integers representing the heights of the bar.
// We need to find, How much water is trapped between the bars.
// Note -> Each bar is of width 1

public class Arrays_Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int n = arr.length;
		
		// Approach -1
		// T.C -> O(N2)
		// S.C -> O(1)
		
//		System.out.println(approach1(arr, n));
		
		// Approach - 2
		// T.C -> O(N)
		// S.C -> O(N)
		
		System.out.println(approach2(arr, n));
	}
	
	
	// In each step, we are calculating the current left and right Max
	// to check, how much water can each element trap.
	
	//sum += Math.min(leftMax, rightMax) - arr[i];
	
	public static int approach1(int[] arr, int n) {
		int sum = 0;
		
		for(int i =0; i<n; i++) {
			int leftMax = Integer.MIN_VALUE;
			int rightMax = Integer.MIN_VALUE;
			
			int j = i;
			
			while(j >= 0) {
				if(leftMax < arr[j]) {
					leftMax = arr[j];
				}
				j--;
			}
			
			j = i;
			
			while(j < n) {
				if(rightMax < arr[j]) {
					rightMax = arr[j];
				}
				j++;
			}
			
			sum += Math.min(leftMax, rightMax) - arr[i];
		}
		
		return sum;
	}

	// To reduce the Time complexity, we have calculated the Left and right max beforeHand.
	// So we can directly access it from the array index.
	
	//sum += Math.min(leftMax[i], rightMax[i]) - arr[i];
	
	public static int approach2(int[] arr, int n) {
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];
		
		int max = Integer.MIN_VALUE; 
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			leftMax[i] = max;
		}
		
		max = Integer.MIN_VALUE;
		
		for(int i=arr.length-1; i>=0 ; i--) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			rightMax[i] = max;
		}
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += Math.min(leftMax[i], rightMax[i]) - arr[i];
		}
		
		return sum;
	}
}
