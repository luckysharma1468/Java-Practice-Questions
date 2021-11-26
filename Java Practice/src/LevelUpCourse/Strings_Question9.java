package LevelUpCourse;

import java.util.*;

public class Strings_Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		
		String result = breakPalindrome(s);
		
		System.out.println(result);
	}
	
	public static String breakPalindrome(String s) {
		char[] arr = s.toCharArray();
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			if(arr[i] != 'a') {
				arr[i] = 'a';
				
				return String.valueOf(arr);
			}
		}
		
		arr[n-1] = 'b';
		
		return n < 2 ? "" : String.valueOf(arr);
	}

}
