import java.util.*;

// Find the smallest window of distinct characters in the inputted string

// Sample Input - 1

// aabcbcdbcaaad

// Sample Output - 1

// dbca

// Sample Input - 2

// aaaa

// Sample Output - 2

// a 

public class SlidingWindow_Question4{
	
	public static String find_Window(String s){
		HashSet<Character> set = new HashSet<>();
		for(char c: s.toCharArray()){
			set.add(c);
		}

		String p = "";
		for(char c: set){
			p += c;
		}

		// Initializing frequency map for String & Pattern
		int[] FS = new int[256];
		int[] FP = new int[256];

		int cnt = 0; // counter to check whether we founded all the characters of a pattern or not
		int start = 0; // start of current window
		int window_size = -1; // current window size
		int min_window_size = Integer.MAX_VALUE;
		int start_idx = -1; // start of minimum window / result window


		for(int i=0; i<p.length(); i++){
			FP[p.charAt(i)]++;
		}

		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);

			// Expanding the window
			FS[ch]++;

			// Incrementing the counter when both the below conditions are satisfied
			// a) the current character is present in the Pattern
			// b) Frequency in the window is less then or equal to the frequency of the pattern
			if(FP[ch] != 0 && FS[ch] <= FP[ch]){
				cnt +=1;
			}

			// Contracting the window when the counter become equal to the pattern length

			if(cnt == p.length()){


				// Remove the character from the window if any one of the below condtion satisfies
				// a) If the character is not in the pattern
				// b) Frequency of the character in the window is greater then Frequency in the Pattern
				while(FP[s.charAt(start)] == 0 || FS[s.charAt(start)] > FP[s.charAt(start)]){
					FS[s.charAt(start)]--;
					start++;
				}

				window_size = i - start + 1;
				if(min_window_size > window_size){
					min_window_size = window_size;
					start_idx = start;
				}
			}

		}

		if(start_idx == -1){
			return "No window found";
		}


		return s.substring(start_idx, start_idx+min_window_size);
	}

	public static void main(String[] args) {
		// String s = "aabcbcdbcaaad";
		String s = "aaaa";

		String result = find_Window(s);

		System.out.println(result);

	}
}