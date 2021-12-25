import java.util.*;

// Min Pair

// Given two non-empty arrays, we have to find a pair, one element from each array
// so that absolute difference is minimum.

// Sample Input 

// int[] a1 = {-1, 5, 10, 20, 3};
// int[] a2 = {26, 134, 135, 15, 17};

// Sample Output 

// 17, 20

// Idea -> 

// We will sort 2nd array --> T.C -> O(MLogM)
// Then we traverse first array and for each element we will find the closest element
// or the lower bound of that element in the second array
// For every lower bound --> we have two cases

// two cases coz, as lower bound returns an index which is greater than or equal to the 
// element we are searching

// we will consider lower bound index (lb) and lb-1 (lb >= 1) for this case

// T.C for this approach will be ---> O(MLogM) + O(NLogN)

// O(MLogM) <- for sorting
// O(NlogN) <- for traversing and searching

public class Searching_Question6{

	public static int lowerBound(int[] arr, int x){
		int start =0;
		int end = arr.length -1;

		int ans = arr.length;

		while(start <= end){
			int mid = (start + end)/2;

			if(arr[mid] == x){
				return mid;
			}

			if(arr[mid] > x){
				ans = mid;
				end = mid-1;
			}else{
				start = mid +1;
			}
		}

		return ans;
	}
	
	public static void minPair(int[] a1, int[] a2){
		Arrays.sort(a2);

		int p1 = -1, p2 = -1;
		int diff = Integer.MAX_VALUE;

		for(int x: a1){
			int lb = lowerBound(a2,x);

			if(lb>= 1 && x - a2[lb-1] < diff){
				diff = x - a2[lb-1];
				p2 = x;
				p1 = a2[lb-1];
			}

			// Its an edge case (lb != a2.length), as if the element is not present
			// or all the elements are smaller then the searching element
			// in the array,then it will return arr.length index
			if(lb!=a2.length && a2[lb] - x < diff){
				diff = a2[lb] - x;
				p1 = x;
				p2 = a2[lb];
			}
		}

		System.out.println("Min Pair " + p1 + ", " + p2);
	}

	public static void main(String[] args) {
		int[] a1 = {-1, 5, 10, 20, 3};
		int[] a2 = {26, 134, 135, 15, 17};

		minPair(a1, a2);
	}
}