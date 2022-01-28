import java.util.*;

// O(2^n) ---> O(n)

// Arrays 

// [2, 3, 1, 9, 5, 24] -> 2, 3, 1, 9, 5 --> ----> 2

// 2, (3, 1, 9, 5, 24)
// 2, 3, (1, 9, 5, 24) --> 2, 3, (9, 5, 24) ---> 2, 3, (5, 24) --> 2, 3, 5, (24)

// 2, 3, 1 (9, 5, 24) --> 2, 3, 1, (5, 24) --> 2, 3, 1, 5, (24)
// 2, 3, 1, 9 (5, 4) --> 2, 3, 1, 9 (4) 

// 2, 3, 1, 9, 5, (4) --> 2, 3, 1, 9, 5, []
// 2, 3, 1, 9, 5, 4, []
// Subset SUM = 10
// Recursion 

// Print all subsets of an array
// [1, 2, 3]
// [1], [2], [3], [1, 2], [1, 3], [1, 2 ,3] 

public class practice4{

	public static boolean subsetSum(int[] arr, int n, int cp, int targetSum, int currSum){
		if(currSum == targetSum){
			return true;
		}

		if(cp == n){
			return false;
		}

		return subsetSum(arr, n, cp+1, targetSum, currSum+arr[cp]) || subsetSum(arr, n, cp+1,targetSum, currSum);
	}

	public static void main(String[] args) {
		int[] arr = {2, 3, 1, 9, 5, 24};
		int targetSum = 43;
		System.out.println(subsetSum(arr, arr.length, 0, targetSum, 0));
	}
}