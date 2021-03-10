package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take N (number of rows), print the following pattern (for N = 4).

                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1   
	Input Format
	Constraints
	0 < N < 10
	
	Output Format
	Sample Input
	4
	Sample Output
	1						1
	1	2				2	1
	1	2	3		3	2	1
	1	2	3	4	3	2	1
	Explanation
	Each number is separated from other by a tab.
 */

public class question15 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int nsp = (2 * n) - 3;
		int nst = 1;
		int val = 1;

		for (int i = 1; i <= n; i++) {

			val = 1;
			// values
			for (int j = 1; j <= nst; j++) {
				System.out.print(val + "\t");
				val++;
			}

			// spaces
			for (int j = 1; j <= nsp; j++) {
				System.out.print("\t");
			}

			if (nsp < 0) {
				val--;
				nst--;
			}
			// stars
			for (int j = 1; j <= nst; j++) {
				val--;
				System.out.print(val + "\t");
			}

			nsp -= 2;
			nst++;
			System.out.println();
		}
	}
}
