package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take N (number of rows), print the following pattern (for N = 4)
	0
	1 1
	2 3 5
	8 13 21 34
	
	Input Format
	Constraints
	0 < N < 100
	
	Output Format
	Sample Input
	4
	Sample Output
	0 
	1    1 
	2    3     5 
	8   13    21    34
	
	Explanation
	
	Each number is separated from other by a tab. 
	For given input n, You need to print n(n+1)/2 fibonacci numbers. 
	Kth row contains , next k fibonacci numbers.
 */

public class question14 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 0, b = 1, c = 0;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(a + "  ");
				c = a + b;
				a = b;
				b = c;
			}

			System.out.println();

		}

		scan.close();
	}
}
