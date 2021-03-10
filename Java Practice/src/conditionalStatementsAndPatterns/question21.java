package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take the following as input.

A number (N1)
A number (N2)
Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

Input Format
Constraints
0 < N1 < 100 0 < N2 < 100

Output Format
Sample Input
10 
4
Sample Output
5 
11 
14 
17 
23 
26 
29 
35 
38 
41
Explanation
The output will've N1 terms which are not divisible by N2.
 */

public class question21 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		int count = 0;
		int start = 1;

		while (n1 != count) {

			int value = 3 * start + 2;

			if (value % n2 != 0) {
				System.out.println(value);
				count += 1;
			}

			start += 1;
		}

		scan.close();
	}

}
