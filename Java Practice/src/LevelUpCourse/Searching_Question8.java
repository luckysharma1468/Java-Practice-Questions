import java.util.*;

// Divide coins array into K partitions such that, minimum value in 
// one of the partition is maximum.

				// OR

// Divide books array contatining pages into k partitions such that, minimum number of
// pages assigned to a student is maximum

// Sample Input 

//  int k = 3;
//  int[] coins = {1, 2, 3, 4};

// Sample Output

// 3

// Idea --->

// Minimum value in one partition can be Zero (0)
// Maximum value in one partition can be Sum of all the elements (10) 
// This becomes our search space 0 to 10

// we will apply binary search over it and find the minimum (Max) value which we can 
// put in one partition.

// T.C --> O(NLogN)

public class Searching_Question8{

	public static boolean canDivideK(int[] coins, int n, int k, int limit){
		int current_friend_sum = 0;
		int partition = 0;

		for(int i=0; i<n; i++){
			if(current_friend_sum + coins[i] >= limit){
				partition += 1;
				current_friend_sum = 0;

				if(partition == k){
					return true;
				}
			}
			else{
				current_friend_sum += coins[i];
			}
		}

		return false;
	}

	public static int kCoins(int[] coins, int n, int k){
		int start = 0;
		int end = Arrays.stream(coins).sum(); // sum of an array

		int ans = -1;
		while(start <= end){
			int mid = (start+end)/2;

			boolean isPossible = canDivideK(coins, n, k, mid);

			if(isPossible){
				start = mid +1;
				ans = mid;
			}
			else{
				end = mid -1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int k = 2;
		int[] coins = {10, 20, 30, 45};

		int result = kCoins(coins, coins.length, k);

		System.out.println(result);
	}
}