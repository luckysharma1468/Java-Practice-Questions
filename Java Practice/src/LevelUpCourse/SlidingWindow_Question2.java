package LevelUpCourse;
import java.util.*;

// Unique Substring of Maximum length

// Sample Input
// prateekbhaiya
// aabcb

// Sample Output
// ekbhaiy
// abc

public class SlidingWindow_Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "prateekbhaiya";
//		String s = "aabcb";
		
		String result = LargestUnqiueSubstring(s, s.length());
		
		System.out.println(result);
	}
	
	public static String LargestUnqiueSubstring(String s, int n) {
		int start = -1;
		
		int i = 0;
		int j = 0;
		
		int CWL = 0;
		int MWL = Integer.MIN_VALUE;
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		while(j < n) {
			
			char ch = s.charAt(j);
			
			if(map.containsKey(ch) && map.get(ch) >= i) {
				i = map.get(ch) + 1;
				CWL = j - i;
			}
			
			map.put(ch, j);
			CWL++;
			j++;
			
			if(CWL > MWL) {
				MWL = CWL;
				start = i;
			}
		}
		
		return s.substring(start, start+MWL);
	}
	

}
