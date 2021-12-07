import java.util.*;

// Sorting Sub arrays

// We need to find the continous subarray indicies, if we sort the array between that
// indicies, whole array will become sorted
// if the given array is already sorted then we will return [-1, 1]

// Sample Input - 1

// arr = {0, 2, 4, 7, 10, 11, 7, 12, 13, 14, 16, 19, 29};

// Sample Output - 1

// [4, 6]

public class Sorting_Question3{

	public static ArrayList<ArrayList<Integer>> SortingSubarrays(int[] arr, int n){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		int[] sortedArray = new int[arr.length]; 

		System.arraycopy(arr, 0, sortedArray, 0, arr.length);

		Arrays.sort(sortedArray);
		int i = 0;
		int j = 0;
		int index = -1;

		while(i< n && j < n){
			if(arr[i] != sortedArray[j]){
				index = i;
				break;
			}

			i++;
			j++;
		}

		if(index == -1){
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(-1);
			temp.add(-1);
			result.add(temp);
			return result;
		}

		int k = index;
		while(k > 0 && arr[k-1] > arr[index]){
			k--;
		}

		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(index);
		temp.add(k);
		result.add(temp);

		return result;
	}

	public static void main(String[] args) {
		int[] arr = {0, 2, 4, 7, 10, 11, 7, 12, 13, 14, 16, 19, 29};

		System.out.println(SortingSubarrays(arr, arr.length));
	}
}