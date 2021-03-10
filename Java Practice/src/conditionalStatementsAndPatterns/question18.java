package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
101010
Sample Output
42
Explanation
For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.
 */

public class question18 {
	
    public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);

		int binary = scan.nextInt();
		int two = 1, decimal = 0;

		while (binary != 0) {

			int last = binary % 10;
			decimal += (last * two);

			binary = binary / 10;

			two *= 2;
		}

		System.out.println(decimal);

		scan.close();
    }


}
