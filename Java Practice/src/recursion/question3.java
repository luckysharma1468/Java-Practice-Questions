package recursion;

import java.util.Scanner;

/*
 * Take as input N, the size of an integer array. Take one more input, 
 * which is a list of N integers separated by a space, and store that in an array.
 *  Write a recursive function which prints true if the array is sorted, and false otherwise.

Input Format
N x y z

Constraints
1 < N < 1000
-10^9 < i < 10^9, where i is an element of the array

Output Format
true OR false

Sample Input
5
1 2 3 4 5
Sample Output
true
 */

public class question3 {

	public static boolean isSorted(int[] arr, int si, int end){

		if(si == end){
			return true;
		}

		boolean flag = false;
		if(arr[si] <= arr[si+1]){
			flag = isSorted(arr, si+1, end);
		}

		return flag;
	}

    public static void main(String args[]) {
        // Your Code Here
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}

		System.out.println(isSorted(arr, 0, n-1));
    }
}
