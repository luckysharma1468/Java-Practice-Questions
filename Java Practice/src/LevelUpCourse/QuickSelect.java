import java.util.*;

// Find the kth smallest element from the unsorted array
// T.C ----> is non deterministic but on average its O(NLOGN) but if we choose a good
// pivot it can also give us a O(N)
// In the worst case it can go upto O(N2)

// Sample Input 

// int[] arr = {10, 5, 2, 0, 7, 6, 4};
// k = 4

// Sample Output

// 5

public class QuickSelect{

	public static void swap(int[] arr, int first, int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

 	}

	public static int partition(int[] arr, int s, int e){
		int pivot = e;
		int i = s-1;

		for(int j=s; j<e; j++){
			if(arr[j] < arr[pivot]){
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i+1, pivot);
		return i+1;
	}

	public static int QuickSelect(int[] arr, int start, int end, int k){
		int p = partition(arr, start, end);

		if(k == p){
			return arr[p];
		}
		else if(k < p){
			return QuickSelect(arr, start, p-1, k);
		}
		else{
			return QuickSelect(arr, p+1, end, k);
		}

	}

	public static void main(String[] args) {
		int[] arr = {10, 5, 2, 0, 7, 6, 4};
		int start = 0;
		int end = arr.length - 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Kth element");
		int k = scan.nextInt(); // Taking 1 based indexing as input

		System.out.println(QuickSelect(arr, start, end, k-1)); // Going forward with zero based 
															   // indexing 

	}
}