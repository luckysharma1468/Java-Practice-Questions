package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Given number of rows N, you have 
 * to print a Hollow Rhombus. 
 * See the output for corresponding given input.

	Input Format
	Single integer N.
	
	Constraints
	N <= 20
	
	Output Format
	Print pattern.
	
	Sample Input
	5
	Sample Output
	    *****
	   *   *
	  *   *
	 *   *
	*****
Explanation
For any input N. First line contains 4 space and 
then 5 {*} and then the second 
line contains according to the output format.
 */

public class question4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int nsp = n - 1;
		int nst = n;

		for (int i = 1; i <= n; i++) {

			// spaces

			for (int j = 1; j <= nsp; j++) {
				System.out.print(" ");
			}

			// stars

			for (int j = 1; j <= nst; j++) {
				if (i == 1 || i == n) {
					System.out.print("*");
				} else if (j == 1 || j == nst) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			nsp--;
			System.out.println();
		}
	}
}
