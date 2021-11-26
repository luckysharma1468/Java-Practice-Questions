package recursion;

import java.util.*;

/*
 * Given an array A, of N elements. Sort the array using mergesort algorithm.

Input Format
A single integer, N, denoting the number of elements in array.
 Next line contains N integers, denoting the elements of array.

Constraints
1<=N<=2*10^5
|Ai|<=10^9

Output Format
Print in a single line, N spaced integers, denoting the elements of array A in sorted order.

Sample Input
5
3 6 4 1 2
Sample Output
1 2 3 4 6 
 */

public class question14 {
	 public static void main(String args[]) {
	        // Your Code Here
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int[] arr = new int[n];

			for(int i=0; i<n; i++){
				arr[i] = scan.nextInt();
			}

			int[] result = mergeSort(arr, 0, n-1);

			for(int i: result){
				System.out.print(i + " ");
			}
	    }

		public static int[] mergeSort(int[] arr, int low, int high){

			if(low == high){
				int[] temp = new int[1];
				temp[0] = arr[low];
				return temp;
			}

			int mid = low + (high-low)/2;

			int[] a = mergeSort(arr, low, mid);
			int[] b = mergeSort(arr, mid+1, high);

			int[] result = merged(a, b);

			return result; 
		}

		public static int[] merged(int[] a, int[] b){
			int na = a.length;
			int nb = b.length;

			int[] result = new int[na+nb];

			int i=0, j=0, k= 0;

			while(i < na && j < nb){
				if(a[i] <= b[j]){
					result[k++] = a[i++];
				}else{
					result[k++] = b[j++];
				}
			}

			if(i == na){
				while(j < nb){
					result[k++] = b[j++];
				}
			}else{
				while(i < na){
					result[k++] = a[i++];
				}
			}
			
			return result;
		}
}
