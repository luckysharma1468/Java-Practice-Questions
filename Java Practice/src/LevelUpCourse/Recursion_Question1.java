import java.util.*;

// Ladder Problem

// In how many ways, a person can reach to the position at N.
// He can take between 1, 2 and 3 steps to reach N.

// Time Complexity

// As we are making 3 calls at a time, so the time complexity will be O(3^N)
// which is really bad and we can reduce it using DP.

public class Recursion_Question1{

	public static int countWays(int n){
		if(n < 0){
			return 0;
		}

		if(n==0){
			return 1;
		}

		return countWays(n-1) + countWays(n-2) + countWays(n-3);
	}

	public static void main(String[] args) {
		int N = 4;
		int result = countWays(N);

		System.out.println(result);
	}
}