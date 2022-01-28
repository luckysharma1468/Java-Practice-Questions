import java.util.*;

// Recursion

public class practice1{

	public static boolean isArraySorted(int[] arr, int n, int curr){

		// Base Case
		if(curr+1 == n){
			return true;
		}

		// Recursive case
		if(arr[curr] < arr[curr+1]){
			return isArraySorted(arr, n, curr+1);
		}
		
		return false;

	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, -1, 6};
		System.out.println(isArraySorted(arr, arr.length, 0));
	}
}