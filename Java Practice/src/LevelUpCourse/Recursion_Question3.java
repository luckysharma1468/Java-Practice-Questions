import java.util.*;

// 1) Check whether we have a subset for the given sum or not ?.
// 2) Count number of subsets for the given sum

// Time complexity for the given solution is O(2^N)

public class Recursion_Question3{

	// public static void printSubsetsOfSum(int[] arr, int n, int i, int sum, ArrayList<Integer> result){
	// 	if(i == n){
	// 		if(sum == 0){
	// 			System.out.println(result);
	// 		}

	// 		return;
	// 	}

	// 	printSubsetsOfSum(arr, n, i+1, sum, result);
	// 	result.add(arr[i]);
	// 	printSubsetsOfSum(arr, n, i+1, sum-arr[i], result);
		
	// }

	public static int countSubsetSum(int[] arr, int n, int i, int sum){
		if(i == n){
			if(sum == 0){
				return 1;
			}

			return 0;
		}

		// Optional Base Cases
		// if(sum == 0){
		// 	return 1;
		// }

		// if(sum < 0){
		// 	return 0;
		// }

		return countSubsetSum(arr, n, i+1, sum-arr[i]) + countSubsetSum(arr, n, i+1, sum);
	}
	
	public static boolean subsetExist(int[] arr, int n, int i, int sum){
		if(i == n){
			if(sum == 0){
				return true;
			}

			return false;
		}

		return subsetExist(arr, n, i+1, sum-arr[i]) || subsetExist(arr, n, i+1, sum);
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int n = arr.length;
		int sum = 6;
		// boolean result = subsetExist(arr, n, 0, 6);
		// int result = countSubsetSum(arr, n, 0, sum);

		// printSubsetsOfSum(arr, n, 0, 10, new ArrayList<Integer>()); // TODO - Fix this fxn

		// System.out.println(result);
	}
}