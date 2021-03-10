package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take N as input. For a value of N=5, we wish to draw the following pattern :

                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4 
                              3 2 1 0 1 2 3 
                                2 1 0 1 2 
                                  1 0 1 
                                    0 
                                  1 0 1 
                                2 1 0 1 2 
                              3 2 1 0 1 2 3 
                            4 3 2 1 0 1 2 3 4 
                          5 4 3 2 1 0 1 2 3 4 5
Input Format
Take N as input.

Constraints
N <= 20

Output Format
Pattern should be printed with a space between every two values.

Sample Input
5
Sample Output
 5 4 3 2 1 0 1 2 3 4 5
   4 3 2 1 0 1 2 3 4 
     3 2 1 0 1 2 3 
       2 1 0 1 2 
         1 0 1 
           0 
         1 0 1 
       2 1 0 1 2 
     3 2 1 0 1 2 3 
   4 3 2 1 0 1 2 3 4 
 5 4 3 2 1 0 1 2 3 4 5
 */

public class question26 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int nov = n;
		int nsp = 0;

		for (int i = 1; i <= (2 * n + 1); i++) {

			// nsp

			for (int j = 1; j <= nsp; j++) {
				System.out.print("  ");
			}

			// nov

			for (int j = nov; j >= 1; j--) {
				System.out.print(j + " ");
			}

			// Middle Zero

			System.out.print(0 + " ");

			// nov

			for (int j = 1; j <= nov; j++) {
				System.out.print(j + " ");
			}

			if (i <= n) {
				nov--;
				nsp++;
			} else {
				nov++;
				nsp--;
			}

			System.out.println();
		}
	}

}
