import java.util.*;

// Note - Smallest_String ===> is Sorting_Question2

// Sparse Search

// Given an sorted array of strings interpersed with empty strings, we have to find a given key

// Sample Input - 1
// arr = {"ai", "", "", "bat", "", "", "car", "cat", "", "", "dog", ""}; 
// key = "bat";

// Sample Output - 1
// 4 ---> 1 based indexing



// We can solve this question using linear search ---> O(N*W) time complexity
// W is the length of the word

// ALthough we are solving this question using modified binary search to solve this question
// which in average gives better time complexity but in worst case it gives O(N)

public class Searching_Question1{

	public static int modifiedBinarySearch(String[] arr, int start, int end, String key){
		while(start <= end){
			int mid = (start+end)/2;

			int mid_left = mid-1;
			int mid_right = mid+1;

			if(arr[mid] == ""){
					
				while(true){

					if(mid_left < start && mid_right > end){
						return -1;
					}
					else if(mid_left >= start && arr[mid_left] != ""){
						mid = mid_left;
						break;
					}
					else if(mid_right <= end && arr[mid_right] != ""){
						mid = mid_right;
						break;
					}

					mid_left--;
					mid_right++;
				}
			}

			if(arr[mid] == key){
				return mid;
			}
			else if(arr[mid].compareTo(key) > 0){
				end = mid-1;
			}
			else{
				start = mid+1;
			}

		}

		return -1;
	}

	public static void main(String[] args) {
		String[] arr = {"ai", "", "", "bat", "", "", "car", "cat", "", "", "dog", ""};
		String key = "bat";

		int start = 0;
		int end = arr.length -1;


		int result = modifiedBinarySearch(arr, start, end, key);

		result++; // Making result to 1 based indexing

		System.out.println(result);

	}
}