package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take N as input. For a value of N=5, we wish to draw the following pattern :

             5                   5 
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 
Input Format
Take N as input.

Constraints
Output Format
Pattern should be printed with a space between every two values.

Sample Input
5
Sample Output
5                   5 
5 4               4 5 
5 4 3           3 4 5 
5 4 3 2       2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2 1 0 1 2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2       2 3 4 5 
5 4 3           3 4 5 
5 4               4 5 
5                   5 
 */

public class question30 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int nov = 1;
		int nsp = 2 * n - 1;
		int val = n;

		for (int i = 1; i <= (2 * n + 1); i++) {

			val = n;
			// values

			for (int j = 1; j <= nov; j++) {
				System.out.print(val + " ");
				val--;
			}

			// spaces

			for (int j = 1; j <= nsp; j++) {
				System.out.print("  ");
			}

			// values

			if (i == (n + 1)) {
				nov -= 1;
				val = 0;
			}

			for (int j = 1; j <= nov; j++) {
				val++;
				System.out.print(val + " ");
			}

			if (i <= n) {
				nsp -= 2;
				nov++;
			} else if (i == (n + 1)) {
				nsp = 1;
				nov = n;
			} else {
				nsp += 2;
				nov--;
			}

			System.out.println();
		}
	}

}
