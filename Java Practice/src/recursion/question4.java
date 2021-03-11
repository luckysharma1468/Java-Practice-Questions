package recursion;
import java.util.*;

/*
 * You will be given a numeric string S. Print all the possible codes for S.

Following vector contains the codes corresponding to the digits mapped.

string table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

For example, string corresponding to 0 is " " and 1 is ".+@$"

Input Format
A single string containing numbers only.

Constraints
length of string <= 10

Output Format
All possible codes one per line in the following order.

The letter that appears first in the code should come first

Sample Input
12
Sample Output
.a
.b
.c
+a
+b
+c
@a
@b
@c
$a
$b
$c
Explanation
For code 1 the corresponding string is .+@$ and abc corresponds to code 2.
 */

public class question4 {
	static String[] table = { " ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		ArrayList<String> result = smartKeypad(s);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

	public static ArrayList<String> smartKeypad(String s) {

		if (s.length() == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}

		char cc = s.charAt(0);
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> recRes = smartKeypad(s.substring(1));

		int CN = cc - '0';
		String letters = table[CN];

		for (int i = 0; i < letters.length(); i++) {

			char cl = letters.charAt(i);

			for (int j = 0; j < recRes.size(); j++) {
				String temp = recRes.get(j);
				temp = cl + temp;
				result.add(temp);
			}
		}

		return result;

	}
}
