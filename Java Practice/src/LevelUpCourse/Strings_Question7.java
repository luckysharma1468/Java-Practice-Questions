package LevelUpCourse;

import java.util.*;

// Compressing String
// Todo - To compress a given string and return it
// if the compressed string length is greater then the original string return the orignal string
// instead.

// Sample Input
// aaaabcccccaaa
// abc

// Sample Output
// a4b1c5a3
// abc

public class Strings_Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		String result = compressString(s);
		
		System.out.println(result);
		
	}
	
	public static String compressString(String s) {
		StringBuilder str = new StringBuilder();
		
		int i = 0;
		int count = 1;
		int n = s.length();
		
		while(i < n) {
			if(i+1 < n && s.charAt(i) == s.charAt(i+1)) {
				count++;
			}
			else {
				str.append(""+s.charAt(i)+count);
				count = 1;
			}
			
			i++;
		}
		
		String result = str.toString();
		
		return (result.length() > s.length()) ? s : result;
	}

}
