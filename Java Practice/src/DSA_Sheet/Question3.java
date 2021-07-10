package DSA_Sheet;

import Heap.MinHeap;

public class Question3 {

	// Find the "Kth" max and min element of an array 
	// For min --> arr[k-1] <--- due to Zero based indexing
	// For max --> arr[n-k] 
	
//	Input:
//		N = 6
//		arr[] = 7 10 4 3 20 15
//		K = 3
//	Output : 7
	
//		N = 5
//		arr[] = 7 10 4 20 15
//		K = 4
//	Output : 15
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First Solution is using Heap  --> T.C -> O(Logn)
		// S.C --> O(n)
		
		int n = 6;
		int[] arr = {7, 10, 4, 3,  20, 15};
		int k = 3;
		
		MinHeap heap = new MinHeap(n);
		for(int i: arr) {
			heap.insert(i);
		}
		
		int ans = 0;
		int tk = k;
		while(tk > 0) {
			ans = heap.remove();
			tk--;
		}
		
		System.out.println(ans);
		
		// First Sort the array
		mergeSort(arr, 0, n-1);
		
		System.out.println(arr[k-1]);
		
	}
	
	// Using Merge Sort , T.C --> O(nLogn) , S.C --> O(n)
	
	public static void mergeSort(int[] arr, int l, int r) {
		if(l < r) {
			int m = l + (r-l)/2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			
			merge(arr, l, m, r);
		}
	}
	
	public static void merge(int[] arr, int l, int m, int r) {
		
		int n1 = m - l +1;
		int n2 = r - m;
		
		int[] A = new int[n1];
		int[] B = new int[n2];
		
		for(int i=0; i<n1; i++) {
			A[i] = arr[l + i];
		}
		
		for(int j=0; j<n2; j++) {
			B[j] = arr[m+1+j];
		}
		
		int i=0, j=0, k=l;
		
		while(i < n1 && j < n2) {
			if(A[i] <= B[j]) {
				arr[k++] = A[i];
				i++;
			}else {
				arr[k++] = B[j];
				j++;
			}
		}
		
		while( i < n1) {
			arr[k++] = A[i];
			i++;
		}
		
		while(j < n2) {
			arr[k++] = B[j];
			j++;
		}
		
	}

}
