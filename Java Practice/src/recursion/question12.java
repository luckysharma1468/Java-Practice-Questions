package recursion;

import java.util.*;

/*
 * Take as input str, a string. Write a recursive function which returns all the words possible by rearranging the characters of this string which are in dictionary order smaller than the given string. The output strings must be lexicographically sorted.

Input Format
Single line input containing a string

Constraints
Length of string <= 25

Output Format
Display all the words which are in dictionary order smaller than the string entered in a new line each. The output strings must be sorted.

Sample Input
cab
Sample Output
abc
acb
bac
bca
Explanation
The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only four of them are lexicographically less than "cab". We print them in lexicographical order.
 */

public class question12 {

	public static void main(String args[]) {
		// Your Code Here
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		ArrayList<String> list = getPermutation(s);

		Collections.sort(list);

		int index = list.indexOf(s);

		for (int i = 0; i < index; i++) {
			System.out.println(list.get(i));
		}
	}

	public static ArrayList<String> getPermutation(String s) {

		if (s.length() == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}

		char cc = s.charAt(0);
		String ros = s.substring(1);
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> recRes = getPermutation(ros);

		for (int i = 0; i < recRes.size(); i++) {
			String temp = recRes.get(i);

			for (int j = 0; j <= temp.length(); j++) {
				String ms = temp.substring(0, j) + cc + temp.substring(j);
				result.add(ms);
			}
		}

		return result;
	}
}
