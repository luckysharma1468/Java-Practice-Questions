package recursion;

import java.util.Scanner;

/*
 * Take as input str, a string. Write a recursive function which returns a new string in which all duplicate consecutive characters are reduced to a single char. E.g. for “hello” return “helo”. Print the value returned.

Input Format
Enter the string

Constraints
None

Output Format
Display the resulting string

Sample Input
hello
Sample Output
helo
 */

public class question7 {

	public static void main(String args[]) {
		// Your Code Here
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		System.out.println(removeDuplicates(s));
	}

	public static String removeDuplicates(String s) {

		if (s.length() == 1) {
			return ("" + s.charAt(0));
		}

		char cc = s.charAt(0);

		String result = removeDuplicates(s.substring(1));

		if (cc != result.charAt(0)) {
			result = cc + result;
		}

		return result;
	}

}
