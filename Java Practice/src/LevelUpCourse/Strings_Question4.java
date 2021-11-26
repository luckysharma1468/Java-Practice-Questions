package LevelUpCourse;

import java.util.*;

// Check Subsets
// Whether a s2 string is a subsequence of first string
// Sample Input
// s1 => codingminutes
// s2 => cines

// Sample Output
// 	Yes

public class Strings_Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		
		
		int j = 0;
		
		for(int i=0; i<s1.length(); i++) {
			
			if( (j < s2.length()) && (s2.charAt(j) == s1.charAt(i))) {
				j++;
			}
		}
		
		if(j == s2.length()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
