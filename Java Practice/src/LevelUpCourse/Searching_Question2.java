import java.util.*;

// Write an efficient algorithm that searches for a value in an m x n matrix. 
//This matrix has the following properties:
// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.

// If you found the target value return its index 

// Sample Input - 1

// 3 3 (M and N)

// 1 4 9
// 2 5 10
// 6 7 11

// 10 ( Target value )


// Sample Output - 1

// {1, 2}

public class Searching_Question2{

	public static int binarySearch(int[] arr, int start, int end, int x){

		if(start <= end){
			int mid = (start + end)/2;

			if(arr[mid] == x){
				return mid;
			}

			if(arr[mid] > x){
				return binarySearch(arr, start, mid-1, x);
			}
			else{
				return binarySearch(arr, mid+1, end, x);
			}
		}

		return -1;
		
	}
	
	public static ArrayList<ArrayList<Integer>> staircaseSearch(int[][] arr, int target){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		for(int i =0; i < arr.length; i++){
			int lastIndex = arr[i].length-1;
			if(arr[i][0] <= target && target <= arr[i][lastIndex]){
				int index = binarySearch(arr[i], 0, lastIndex, target);

				if(index != -1){
					ArrayList<Integer> indicies = new ArrayList<>();
					indicies.add(i);
					indicies.add(index);
					result.add(indicies);

					return result;
				}
			}
		}

		return result; 
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 4, 9}, {2, 5, 10}, {6, 7, 11}};
		int target = 10;		

		System.out.println(staircaseSearch(arr, target));
	}
}


