import java.util.*;

// Given an array of strings, you have to combine all the strings in such a way
// that the resultant string will be lexographically smallest in all the existing
// combinations

// Sample Input - 1

// arr = {"a", "ab", "aba"}

// Sample Output - 1

// aabaab

public class Smallest_String{


	public static void main(String[] args) {
		String[] arr = {"a", "ab", "aba"};


		// Approach ---> we break down the problem length from
		// whole size of an array to only two strings at a time.

		// {"a", "ab", "aba"} <--- This is lexoGraphically sorted array
		// So to sort any array,Basix idea is -> we compare two elements with each other

		// Here is the catch -> we are comparing the combinations in this case
		// means we can combine x and y by two ways
		// 1. x+y
		// 2. y+x

		// if(x+y) < (y+x)
		// 		means  will put x before y
		// else 
		//		will put y before

		// Through this comparing combination approach we will get the right position
		// of every element which makes our resultant string lexographically sorted.

		// in the end we get an array which is lexographically sorted

		// T.C ---> O(NLogN) (Based on the sorting algorithm we are using)
		Arrays.sort(arr, new Comparator<String>(){
			public int compare(String x, String y){
				return (x+y).compareTo(y+x);
			}
		});

		for(String s: arr){
			System.out.print(s);
		}
	}
}