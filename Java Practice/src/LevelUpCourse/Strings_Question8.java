package LevelUpCourse;

import java.util.*;

// String Normalization
// Convert a string to a title case
// Sample Input

// This is SO MUCH FUN!

// Sample Output
// This Is So Much Fun!


public class Strings_Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		String result = stringNormalize(s);
		
		System.out.println(result);
	}
	
	public static String stringNormalize(String s) {
		StringBuilder str = new StringBuilder();
		
		String[] arr = s.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			
			String temp = arr[i];
			char fc = Character.toUpperCase(temp.charAt(0));
			
			temp = temp.substring(1).toLowerCase();
			
			str.append(""+fc+temp+" ");
		}
		
		return str.toString();
	}

}
