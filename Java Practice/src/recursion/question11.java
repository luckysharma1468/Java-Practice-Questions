package recursion;

import java.util.*;

/*
 * Take as input str, a string. Write a recursive function which prints all the words 
 * possible by rearranging the characters of this string which are in dictionary order larger
 *  than the given string.
The output strings must be lexicographically sorted.

Input Format
Single line input containing a string

Constraints
Length of string <= 10

Output Format
Display all the words which are in dictionary order larger than the string entered in a new line each.
 The output strings must be sorted.

Sample Input
cab

Sample Output
cba
Explanation
The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . 
Only one of them is lexicographically greater than "cab". We only print "cba".
 */

public class question11 {
	public static void main(String args[]) {
		// Your Code Here
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		ArrayList<String> list = getPermutation(s);
		Collections.sort(list);

		// System.out.println(list);
		int index = list.indexOf(s);

		for (int j = index + 1; j < list.size(); j++) {
			System.out.println(list.get(j));
		}

	}

	public static ArrayList<String> getPermutation(String s) {

		if (s.length() == 0) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add("");
			return temp;
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
