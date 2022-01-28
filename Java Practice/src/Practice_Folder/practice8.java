import java.util.*;

// [1, 9, 3, 4, 6, 3, 2]
// M = 3

// [9, 3, ...] ---> [2] ---> []

// cp = 0

// Output ---> [2, 5]

// S --> hello ---> helo

// sample Input ---> axxbdxec
// Sample Output ---> abdecxxx


public class practice8{

	public static void returnIndicies(int[] arr, int n, 
												int target, int cp, ArrayList<Integer> ans){

		// Base Case
		if(cp == (n -1)){
			return; 
		}


		// Recursive Case
		if(arr[cp] == target){
			ans.add(cp);
		} 
		returnIndicies(arr, n, target, cp+1, ans);
	}

	public static void main(String[] args) {
		ArrayList<Integer> ans = new ArrayList<>();
		int[] arr = {1, 9, 3, 4, 6, 3, 2};
		int target = 3;
		returnIndicies(arr, arr.length, target, 0, ans);
		System.out.println(ans);
	}
}