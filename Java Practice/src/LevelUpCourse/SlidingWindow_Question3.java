import java.util.*;

// String Window
// Finding the smallest substring in the bigger string such that 
// all the characters of the Smaller string should be present in the 
// Bigger string.
// Condition 1 -> frequency of the characters in the substring should be same or greater then the
// frequency in the smaller string characters
// Condition 2 -> order of characters can be ignored in this question

// Sample Input - 1
// hello_world
// elo

// Sample Output - 1
// ello

// Sample Input - 2
// fizzbuzz
// fuzz 

// Sample Output - 2
// fizzbu

class SlidingWindow_Question3{

	public static String stringWindow(String str, String pattern){
		int[] FP = new int[256];
		int[] FS = new int[256];

		for(int i=0; i<pattern.length(); i++){
			FP[pattern.charAt(i)]++;
		}

		int cnt = 0; // To determine whether all the characters we got or not of the smaller string
		int start = 0; // start of the current window
		int window_size_so_far = 0;
		int max_window_size = Integer.MAX_VALUE;
		int start_of_max_window = -1;

		for (int i=0; i<str.length(); i++) {
			
			// Expanding the window
			char ch = str.charAt(i);
			FS[ch]++;

			// counting how many characters are matched till now (string and pattern)
			if(FP[ch] != 0 && FS[ch] <= FP[ch])
			{
				cnt +=1;
			}	


			// Contracting from left side, if all the characters have been matched
			if(cnt == pattern.length()){

				while( FP[str.charAt(start)] == 0 || FS[str.charAt(start)] > FP[str.charAt(start)]){
					FS[str.charAt(start)]--;
					start += 1;
				} 

				// if current window is greater then the max_window found so far
				window_size_so_far = i-start + 1;

				if(max_window_size > window_size_so_far){
					max_window_size = window_size_so_far;
					start_of_max_window = start;
				}

			}

		}

		if(start_of_max_window == -1){
			return "No Window Found";
		}

		return str.substring(start_of_max_window, start_of_max_window+max_window_size);
	}

	public static void main(String[] args) {
		String str = "aaaa";
		String pattern = "a";

		String result = stringWindow(str, pattern);

		System.out.println(result);
	}
}