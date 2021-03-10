package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Given a number N (denoting one of the legs of the triangle), Print its Pythagoras pair in increasing order if they exist. Otherwise, print "-1".

Input Format
A single integer N

Constraints
N <= 10^9

Output Format
Two numbers X and Y denoting the rest of the numbers of the Pythagorean triplet in increasing order.

Sample Input
3
Sample Output
4 5
 */

public class question25 {
	public static void main(String args[]) {

		long a, b, c;

		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();

		if (n < 3) {
			System.out.println(-1);
		} else if (n % 2 == 0) {

			a = (n * n / 4) - 1;

			b = n;

			c = ((n * n) / 4) + 1;

			System.out.println(a + " " + c);
		} else {

			a = ((n + 1) * (n + 1) / 4) - ((n - 1) * (n - 1) / 4);

			b = 2 * ((n + 1) / 2) * ((n - 1) / 2);

			c = (((n + 1) * (n + 1)) / 4) + (((n - 1) * (n - 1)) / 4);

			System.out.println(b + " " + c);
		}
	}
}
