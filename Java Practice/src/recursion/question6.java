package recursion;

import java.util.Scanner;

/*
 * Take as input str, a string. Write a recursive function which returns a new string
 *  in which all duplicate consecutive characters are separated by a � * �. E.g.
 *  for �hello� return �hel*lo�. Print the value returned

Input Format
Enter a String

Constraints
1<= Length of string <= 10^4

Output Format
Display the resulting string (i.e after inserting (*) b/w all the duplicate characters)

Sample Input
hello
Sample Output
hel*lo
Explanation
We insert a "*" between the two consecutive 'l' .
 */

public class question6 {

	public static void main(String args[]) {
		// Your Code Here
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		System.out.println(putStars(s));
	}

	public static String putStars(String s) {

		if (s.length() == 1) {
			return ("" + s.charAt(0));
		}

		char cc = s.charAt(0);

		String result = putStars(s.substring(1));

		if (cc == result.charAt(0)) {
			result = cc + "*" + result;
		} else {
			result = cc + result;
		}

		return result;

	}

}
