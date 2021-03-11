package recursion;

import java.util.Scanner;

/*
 * Take as input str, a string. Write a recursive function which moves all ‘x’ from the string to its end.
E.g. for “abexexdexed” return “abeedeedxxx”.
Print the value returned

Input Format
Single line input containing a string

Constraints
Length of string <= 1000

Output Format
Single line displaying the string with all x's moved at the end

Sample Input
axbxc
Sample Output
abcxx
Explanation
All x's are moved to the end of string while the order of remaining characters remain the same.
 */

public class question8 {

	public static void main(String args[]) {
		// Your Code Here
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		System.out.println(moveX(s));
	}

	public static String moveX(String s) {

		if (s.length() == 0) {
			return "";
		}

		char cc = s.charAt(0);

		String result = moveX(s.substring(1));

		if (cc == 'x') {
			result = result + 'x';
		} else {
			result = cc + result;
		}

		return result;
	}

}
