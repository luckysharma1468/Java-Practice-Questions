import java.util.*;

// Given an sorted-rotated distint integer array at random point

// we have to find a given key.

// we can solve this problem via two approaches

// 1. Find a pivot point and then do the binary search accordingly on either half based on the key

// T.C --> N to find the pivot point and to binary search --> O(LogN)

// 2. Modify the binary search --> which is implemented below and T.C will be --> O(LogN)

// Idea is ---> Check the mid lies in first half or second half

// first half or second half means ---> mid lies on which sorted part of an array

// Once we know mid lies on which half, then there we will be two cases 

//  we will check ---> if key lies in the sorted part of the half then we move our 
//  start and end accordingly 

public class Searching_Question4{
	
	public static int rotated_search(int[] arr, int start, int end, int key){

		while(start <=  end){
			int mid = (start + end)/2;

			if(arr[mid] == key){
				return mid;
			}

			// check mid lies in line 1 and line 2
			if(arr[start] <= arr[mid]){ // when mid lies in 1st line / first half

				if(arr[start] <= key && key <= arr[mid]){
					end = mid - 1;
				}
				else{
					start = mid + 1;
				}
			}
			else{
				if(key >= arr[mid] && key <= arr[end]){
					start = mid + 1;
				}
				else{
					end = mid - 1;
				}
			}	
		}


		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
		int key = 2;
		int start = 0;
		int end = arr.length -1;

		int result = rotated_search(arr, start, end, key);

		System.out.println(result);

	}
}