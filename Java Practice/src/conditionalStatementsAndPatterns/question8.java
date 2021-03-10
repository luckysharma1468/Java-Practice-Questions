package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Prateek recently graduated from college. To celebrate, 
 * he went to a candy shop and bought all the candies. 
 * The total cost was a number upto which there are n prime numbers
 *  (starting from 2). Since Prateek wants to minimize his cost, 
 *  he calls you to help him find the minimum amount that needs to be paid. 
 *  Being a student of Prateek bhaiya it is now your job to help him out :)

	Input Format
	First line contains a single integer denoting the number of test cases T. 
	Next T lines contains a single integer N, denoting the number of primes required.
	
	Constraints
	T <= 10000
	
	It is guaranteed that the answer does not exceed 10^6.
	
	Output Format
	Print the minimum cost that needs to be paid.
	
	Sample Input
	2
	5
	1
	Sample Output
	11
	2
	Explanation
	In the first case there are 5 primes upto 11(2,3,5,7,11).
 */

public class question8 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		boolean[] prime = new boolean[1000000];
		int[] arr = new int[1000000];
		int index = 1;

		for (int i = 0; i < 1000000; i++) {
			prime[i] = true;
		}

		for (int p = 2; p * p < 1000000; p++) {

			if (prime[p] == true) {

				for (int i = p * p; i < 1000000; i += p) {
					prime[i] = false;
				}
			}
		}

		for (int i = 2; i < 1000000; i++) {
			if (prime[i]) {
				arr[index] = i;
				index++;
			}
		}

		for (int i = 1; i <= n; i++) {
			int num = scan.nextInt();

			System.out.println(arr[num]);
		}

	}
}
