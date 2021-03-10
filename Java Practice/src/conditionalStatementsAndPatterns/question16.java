package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.

	Input Format
	Constraints
	0 < N <= 1000000000
	
	Output Format
	Sample Input
	63
	Sample Output
	77
	Explanation
	Both input and output are integers
 */

public class question16 {
	public static void main(String args[]) {
		// Your Code Here
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int ten = 1;
		int octal = 0;
		while (n != 0) {

			int rem = n % 8;
			octal += rem * ten;

			n = n / 8;
			ten *= 10;
		}

		System.out.println(octal);

		scan.close();
	}
}
