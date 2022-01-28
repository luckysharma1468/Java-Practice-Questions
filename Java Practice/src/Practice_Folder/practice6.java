import java.util.*;

// Reverse an array ---> I have to make a change in an orignal array

// [1, 2, 3, 4, 5, 6]

// [6, 5, 4, 3, 2, 1]


class practice6{

	public static void reverseAnArrayInPlace(int[] arr, int n, int cp){
		// Base Case
		if(cp > (n/2)){
			return;
		}

		// Recursive Case
		int lastPosition = n - 1- cp;
		// Swaping
		int temp = arr[cp];
		arr[cp] = arr[lastPosition];
		arr[lastPosition] = temp; 

		reverseAnArrayInPlace(arr, n, cp+1);
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		reverseAnArrayInPlace(arr, arr.length, 0);
		System.out.println(Arrays.toString(arr));
	}
}