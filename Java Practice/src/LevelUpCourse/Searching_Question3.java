import java.util.*;

// Frequency count

// Given a sorted array, we have to find the frequency of a given key

// Sample Input - 1

// {0, 1, 1, 2, 3, 3, 3, 3, 3, 4, 5, 5, 5, 10}

// Target - 3

// Sample Output - 1

// Output --> 5

// Idea :

// As we can solve this question through linear search i.e O(N)

// But we can improve the complexity and can get an answer in O(LogN) by using Binary Search

//  Main Idea here is ---> we will find the upper bound and lower bound of the target key

// then just subtract ---> Upper Bound - lower bound + 1

// To find lower bound and upper bound --> we will modify our binary search accordingly.

// For lower bound --> whenever we found our given key --> we will update our answer 

// start looking in left part of the array.

// For upper bound --> whenever we found our given key ---> we will update our answer

// start looking in right part of the array.



public class Searching_Question3{


	public static int lowerBound(int[] arr, int start, int end, int x){

		int ans = -1;
		while(start <= end){

			int mid = (start+end)/2;

			if(arr[mid] == x){
				ans = mid;
				end = mid -1; // To find the lower bound, search in the left part of the array
			}
			else if(arr[mid] < x){
				start = mid+1;
			}
			else{
				end = mid -1;
			}
		}

		return ans;
	}

	public static int upperBound(int[] arr, int start, int end, int x){

		int ans = -1;
		while(start <= end){

			int mid = (start+end)/2;

			if(arr[mid] == x){
				ans = mid;
				start = mid + 1; // To find the lower bound, search in the left part of the array
			}
			else if(arr[mid] < x){
				start = mid+1;
			}
			else{
				end = mid -1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 2, 3, 3, 3, 3, 3, 4, 5, 5, 5, 10};
		int target = 3;
		int n = arr.length;

		int lb = lowerBound(arr, 0, n-1, target);
		int ub = upperBound(arr, 0, n-1, target);

		int result =ub > -1 ? ub - lb +1 : -1;

		System.out.println(result);
	}
}