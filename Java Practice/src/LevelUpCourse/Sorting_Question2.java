import java.util.*;

// Sorting array containing 0, 1 and 2 numbers.
// Expected Time Complexity - O(N)
// Expected Space Complexity - O(1)

// Note -> Not even a extra counter variable is allowed other then loops variable.

// Sample Input - 1

// arr = {0, 0, 1, 2, 0, 1, 2, 0};

// Sample Output - 1

// {0, 0, 0, 0, 1, 1, 2, 2};


public class Sorting_Question2{

	public static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static void sortingZOT(int[] arr){
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;

		while(mid <= high){
			switch(arr[mid]){
				case 0:
				{
					swap(arr, low, mid);
					low++;
					mid++;
					break;
				}
				case 1:
				{
					mid++;
					break;
				}
				case 2:
				{
					swap(arr, mid, high);
					high--;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {0, 0, 1, 2, 0, 1, 2, 0};

		sortingZOT(arr);

		System.out.println(Arrays.toString(arr));
	}
}