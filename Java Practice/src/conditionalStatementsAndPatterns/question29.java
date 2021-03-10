package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * 
Take as input N, an odd number (>=5) . Print the following pattern as given below for N = 7.

*  ****
*  *
*  *
*******
   *  *
   *  *
****  *
Input Format
Enter value of N ( >=5 )

Constraints
5 <= N <= 99

Output Format
Print the required pattern.

Sample Input
7
Sample Output
*  ****
*  *
*  *
*******
   *  *
   *  *
****  *
Explanation
Catch the pattern for the corresponding input and print it accordingly.
 */

public class question29 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int mid = (n / 2) + 1;
		int nsp = n / 2 - 1;
		int nst = n / 2;
		int nsp2 = n / 2;

		for (int i = 1; i <= n; i++) {

			if (i < mid) {
				if (i == 1) {
					System.out.print("*");

					for (int j = 1; j <= nsp; j++) {
						System.out.print(" ");
					}

					System.out.print("*");

					for (int j = 1; j <= nst; j++) {
						System.out.print("*");
					}
				} else {
					System.out.print("*");

					for (int j = 1; j <= nsp; j++) {
						System.out.print(" ");
					}

					System.out.print("*");
				}
			} else if (i == mid) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
				}

			} else {

				if (i == n) {
					for (int j = 1; j <= nst; j++) {
						System.out.print("*");
					}

					System.out.print("*");

					for (int j = 1; j <= nsp; j++) {
						System.out.print(" ");
					}

					System.out.print("*");

				} else {

					for (int j = 1; j <= nsp2; j++) {
						System.out.print(" ");
					}

					System.out.print("*");

					for (int j = 1; j <= nsp; j++) {
						System.out.print(" ");
					}

					System.out.print("*");
				}

			}

			System.out.println();
		}
	}
}
