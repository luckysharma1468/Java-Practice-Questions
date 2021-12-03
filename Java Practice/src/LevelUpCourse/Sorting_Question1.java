import java.util.*;

// Inversion count
// Find the number of inversions in the following array
// Inversion can be defined as 
// arr[i] > arr[j] where i < j

// Sample Input 

// {0, 5, 2, 3, 1}

// Sample Output

// 5

public class Sorting_Question1{

	public static int merge(int[] arr, int s, int e){
		int i = s;
		int mid = (s+e)/2;
		int j = mid + 1;

		ArrayList<Integer> temp = new ArrayList<>();

		int inversion_counter = 0;
		while(i <= mid && j <= e){
			if(arr[i] < arr[j]){
				temp.add(arr[i]);
				i++;
			}
			else{
				inversion_counter += (mid - i + 1);
				temp.add(arr[j]);
				j++;
			}
		}

		// Inserting remaining elements from the both the arrays if exists

		while(i<= mid){
			temp.add(arr[i]);
			i++;
		}

		while(j <= e){
			temp.add(arr[j]);
			j++;
		}

		int k =0;
		for(int idx=s; idx<=e; idx++){
			arr[idx] = temp.get(k++);
		}

		return inversion_counter;
	}
	
	public static int inversion_count(int[] arr, int start, int end){

		if(start >= end){
			return 0;
		}

		int mid = (start + end)/2;

		int LeftArrayInversionCount = inversion_count(arr, start, mid);
		int RightArrayInversionCount = inversion_count(arr, mid+1, end);
		int CrossInversionCount = merge(arr, start, end);

		return LeftArrayInversionCount + RightArrayInversionCount + CrossInversionCount;
	}

	public static void main(String[] args) {
		int[] arr = {0, 5, 2, 3, 1};
		int end = arr.length - 1;
		int result = 0;
		// Brute Force Approach - O(N2) <-- Todo

		//Optimal Approach using Merge Sort - O(NLogN)
		result = inversion_count(arr, 0, end);

		System.out.println(result);

	}
}