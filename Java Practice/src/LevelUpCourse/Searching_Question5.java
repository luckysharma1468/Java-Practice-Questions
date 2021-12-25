import java.util.*;

// Find the square root of a given number upto p places

// Sample Input - 1

// N - 10

// P - 3

// Sample Output - 1

// 3.162

// Idea is ---> As we have to find the square root of a number

// so we can also have a search space ---> i.e from 0 to 10

// so we can use binary search to find the integer part 

// in LogN time complexity

// To find the decimal part

// we have 9 options ---> 0.0 to 0.9

// so we can use linear search to find the same

// T.C will be ---> O(LogN) + 9P


public class Searching_Question5{
	
	public static float square_root(int n, int P){
		int start = 0;
		int end = n;
		float ans = -1;

		// Using Binary search here for finding Integer part of root
		while(start <= end){
			int mid = (start+end)/2;

			// For Perfect square
			if(mid*mid == n){
				return mid;
			}

			if(mid*mid < n){
				ans = mid;
				start = mid + 1;
			}
			else{
				end = mid - 1;
			}
		}

		// Using linear search for finding decimal part

		float inc = 0.1f;
		for(int i=1; i<=P; i++){

			while(ans*ans <= n){
				ans += inc;
			}

			ans -= inc;
			inc /= 10.0f;
		}

		return ans;
	}

	public static void main(String[] args) {
		
		int n = 10;
		int p = 3;

		float result = square_root(n, p);

		System.out.println(result);

	}
}