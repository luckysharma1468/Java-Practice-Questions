package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take N (number of rows), print the following pattern (for N = 5).

	     * * * * *
	     * *   * *
	     *       *
	     * *   * *
	     * * * * *
	Input Format
	Constraints
	0 < N < 10 (where N is an odd number)
	
	Output Format
	Sample Input
	5
	Sample Output
	*	*	*       *      *		  
	*	*	        *      *
	* 	                       *
	* 	*               *      *
	* 	*	*       *      *	
	Explanation
	Each '*' is separated from other by a tab.
 */

public class question11 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int nsp = 1;
		int nst = (n - 1) / 2;

		for (int i = 1; i <= n; i++) {

			if (i == 1 || i == n) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*\t");
				}

			} else {

				// stars

				for (int j = 1; j <= nst; j++) {
					System.out.print("*\t");
				}

				// spaces

				for (int j = 1; j <= nsp; j++) {
					System.out.print("\t");
				}

				// stars

				for (int j = 1; j <= nst; j++) {
					System.out.print("*\t");
				}

				if (i <= n / 2) {
					nsp += 2;
					nst -= 1;
				} else {
					nst += 1;
					nsp -= 2;
				}

			}

			System.out.println();
		}

		scan.close();
	}
}
