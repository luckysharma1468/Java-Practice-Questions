package DSA_Sheet;

import java.util.Arrays;

public class Question4 {

	//sort an array of 0, 1 and 2 without using sorting algo
	
	// T.C --> O(n) S.C --> O(1) 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {0, 2, 1, 2, 0};
		
		int[] arr = {0, 1, 0};
		
//		countMethod(arr);
		
		DutchSortMethod(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
	// Dutch National Flag Method
	// T.C --> O(n),  S.C --> O(1)
	
	public static void DutchSortMethod(int[] arr, int n) {
		int low = 0;
		int mid = 0;
		int high = n-1;
		
		int i = 0;
		while(mid <= high) {
			if(arr[i] == 0) {
				swap(arr, low, i);
				low++;
				mid++;
				i++;
			}
			else if(arr[i] == 1) {
				mid++;
				i++;
			}
			else {
				swap(arr, high, i);
				high--;
			}
		}
	}
	
	public static void countMethod(int[] arr) {
		int zero = 0, one = 0, two = 0;
		
		for(int i: arr) {
			if(i == 0) {
				zero++;
			}else if(i == 1) {
				one++;
			}else {
				two++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(zero != 0 ) {
				arr[i] = 0;
				zero--;
			}else if(one != 0) {
				arr[i] = 1;
				one--;
			}else {
				arr[i] = 2;
				two--;
			}
		}
		
	}

}
