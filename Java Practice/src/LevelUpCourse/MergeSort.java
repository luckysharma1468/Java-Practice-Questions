import java.util.*;

// Standard Merge Sort

public class MergeSort{

	public static void merge(int[] arr, int s, int e){
		int i = s;
		int mid = (s+e)/2;
		int j = mid+1;

		ArrayList<Integer> temp = new ArrayList<>();
		while(i <= mid && j <= e){
			if(arr[i] < arr[j]){
				temp.add(arr[i]);
				i++;
			}
			else{
				temp.add(arr[j]);
				j++;
			}
		}

		// Add Remaining items if exists

		// If remaining items present in first array
		while(i<= mid){
			temp.add(arr[i]);
			i++;
		}

		// If remaining items present in second array
		while(j <= e){
			temp.add(arr[j]);
			j++;
		}

		// Pushing back the array items
		int k =0;
		while(k < temp.size()){
			arr[k+s] = temp.get(k);
			k++;
		}

	}

	public static void mergeSort(int[] arr, int s, int e){
		// Base Case --> when an array contains only one element
		// i.e we cannot further sort it as one element is already
		// at its correct position
		if(s >= e){
			return;
		}

		int mid = (s + e)/2;
		mergeSort(arr, s, mid);
		mergeSort(arr, mid+1, e);

		merge(arr, s, e);
	}

	public static void main(String[] args) {
		int[] arr = {10, 5, 2, 0, 7, 6, 4};
		int n = arr.length - 1;

		mergeSort(arr, 0, n);

		System.out.println(Arrays.toString(arr));
	}
}