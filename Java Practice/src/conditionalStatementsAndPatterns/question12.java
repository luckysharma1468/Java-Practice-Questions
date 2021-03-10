package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

	Input Format
	Constraints
	2 < N <= 1000000000
	
	Output Format
	Sample Input
	3
	Sample Output
	Prime
	Explanation
	The output is case specific
 */

public class question12 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int max = 1000000;
		boolean[] prime = new boolean[max];

		for (int i = 0; i < max; i++) {
			prime[i] = true;
		}

		for (int p = 2; p * p < max; p++) {

			if (prime[p]) {

				for (int i = p * p; i < max; i += p) {
					prime[i] = false;
				}
			}
		}

		int num = scan.nextInt();

		System.out.println(prime[num] ? "Prime" : "Not Prime");
	}

}
