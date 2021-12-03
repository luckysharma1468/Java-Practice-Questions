import java.util.*;

// Standard Quicksort algorithm

// T.C -> O(NLogN)

public class QuickSort{

	public static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static int partition(int[] arr, int s, int e){
		int pivot = arr[e];
		int i = s - 1;

		for(int j=s; j<e; j++){
			if(arr[j] < pivot){
				++i;
				swap(arr, i, j);
			}
		}

		swap(arr, i+1, e);

		return i+1;
	}

	public static void quickSort(int[] arr, int s, int e){
		if(s >= e){
			return;
		}

		int p = partition(arr, s, e);

		quickSort(arr, s, p-1);
		quickSort(arr, p+1, e);
	}

	public static void main(String[] args)  {
		int[] arr = {10, 5, 2, 0, 7, 6, 4};
		int start = 0;
		int end = arr.length - 1;


		quickSort(arr, start, end);

		System.out.println(Arrays.toString(arr));
	}
}