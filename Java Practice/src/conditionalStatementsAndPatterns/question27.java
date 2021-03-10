package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take N as input. For a value of N=7, we wish to draw the following pattern :

                            1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 
Input Format
Take N as input.

Constraints
N is odd number.

Output Format
Pattern should be printed with a space between every two values.

Sample Input
7
Sample Output
            1 
        2 1   1 2 
    3 2 1       1 2 3 
4 3 2 1           1 2 3 4 
    3 2 1       1 2 3 
        2 1   1 2 
            1 
Explanation
Catch the pattern and print it accordingly.
 */

public class question27 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int val = 1, nov = 1;
		int nsp = n - 1, nsp2 = 1;

		for (int i = 1; i <= n; i++) {

			if (i == 1 || i == n) {
				// spaces

				for (int j = 1; j <= nsp; j++) {
					System.out.print("  ");
				}

				// values
				for (int j = 1; j <= nov; j++) {
					System.out.print(val + " ");
				}

				val += 1;
				nsp -= 2;
				nov++;

			} else {

				// spaces

				for (int j = 1; j <= nsp; j++) {
					System.out.print("  ");
				}

				// values

				for (int j = 1; j <= nov; j++) {
					System.out.print(val + " ");
					val--;
				}

				// spaces2

				for (int j = 1; j <= nsp2; j++) {
					System.out.print("  ");
				}

				// values

				for (int j = 1; j <= nov; j++) {
					val++;
					System.out.print(val + " ");
				}

				if (i <= (n / 2)) {
					nsp -= 2;
					nsp2 += 2;
					nov++;
					val++;
				} else {
					nsp += 2;
					nsp2 -= 2;
					nov--;
					val--;
				}

			}

			System.out.println();
		}
	}

}
