package DSA_Sheet;

import java.util.Arrays;

// Move All negative numbers to the first Place
// Time Complexity Expected -> O(n)
// Space Complexity --> O(1)


public class Question5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
//		twoPointerApproach(arr, arr.length);
		
		QuicksortPartition(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));

	}
	
	// Two Pointer Approach
	// Time Complexity -> O(n)
	// Space Complexity -> O(1)
	
	public static void twoPointerApproach(int[] arr, int n) {
		int left = 0;
		int right = n-1;
		
		while(left <= right) {
			
			if(arr[left] <0 && arr[right] < 0) {
				left++;
			}
			
			else if(arr[left] > 0 && arr[right] < 0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			
			else if(arr[left] < 0 && arr[right] > 0) {
				left++;
			}
			else {
				left++;
				right--;
			}
		}
	}
	
	public static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	// QuickSort Partition Process
	// Time Complexity -> O(n)
	// Space Complexity -> O(1)
	
	public static void QuicksortPartition(int[] arr, int n) {
		int j =0;
		
		for(int i=0; i<n; i++) {
			if(arr[i] < 0) {
				if(i != j) {
					swap(arr, i, j);
				}
				j++;
			}
		}
	}

}
