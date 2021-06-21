package DSA_Sheet;

import java.util.Arrays;

public class Question1 {

	// Reverse an array
	
	// Time Complexity ---> O(n)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3};
		int[] arr2 = {4, 5, 6, 7};
		
		//iterative approach
		
		int i = 0;
		int j = arr.length -1;
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(arr));
		
		reverseAnArray(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("*********************************");
		
		System.out.println(Arrays.toString(arr2));
		
		reverseAnArray(arr2, 0, arr2.length-1);
		
		System.out.println(Arrays.toString(arr2));
		
	}
	
	public static void reverseAnArray(int[] arr, int start, int end) {
		if(start > end) {
			return;
		}
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		reverseAnArray(arr, start+1, end-1);
	}

}
