package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take the following as input.
A number
A digit
Write a function that returns the number of times digit is found in the number. Print the value returned.

Input Format
Integer (A number) Integer (A digit)

Constraints
0 <= N <= 1000000000 0 <= Digit <= 9

Output Format
Integer (count of times digit occurs in the number)

Sample Input
5433231 
3
Sample Output
3
Explanation
The digit can be from 0 to 9. Assume decimal numbers.In the given case digit 3 is occurring 3 times in the given number.
 */

public class question17 {

	public static int countDigit(String num, int digit) {
		int count = 0;

		for (int i = 0; i < num.length(); i++) {
			if (("" + (num.charAt(i))).equals("" + digit)) {
				count += 1;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int digit = scan.nextInt();

		System.out.println(countDigit("" + num, digit));

		scan.close();
	}

}
