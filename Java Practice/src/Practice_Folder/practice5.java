import java.util.*;

// Arrays 

// [2, 3, 1, 9, 5, 24] -> 2, 3, 1, 9, 5 --> ----> 2

// 2, (3, 1, 9, 5, 24)
// 2, 3, (1, 9, 5, 24) --> 2, 3, (9, 5, 24) ---> 2, 3, (5, 24) --> 2, 3, 5, (24)

// 2, 3, 1 (9, 5, 24) --> 2, 3, 1, (5, 24) --> 2, 3, 1, 5, (24)
// 2, 3, 1, 9 (5, 4) --> 2, 3, 1, 9 (4) 

// 2, 3, 1, 9, 5, (4) --> 2, 3, 1, 9, 5, []
// 2, 3, 1, 9, 5, 4, []
// Count Subset SUM = 10
// Recursion 

public class practice5{

	public static int subsetSum(int[] arr, int n, int cp, int targetSum, int currSum){
		if(currSum == targetSum){
			return 1;
		}

		if(cp == n){
			return 0;
		}

		return subsetSum(arr, n, cp+1, targetSum, currSum+arr[cp]) + subsetSum(arr, n, cp+1,targetSum, currSum);
	}

	public static void main(String[] args) {
		int[] arr = {2, 3, 1, 9, 5, 24};
		int targetSum = 0;
		System.out.println(subsetSum(arr, arr.length, 0, targetSum, 0));
	}
}