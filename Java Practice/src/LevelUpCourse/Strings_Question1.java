package LevelUpCourse;

import java.util.*;

// Returns all the occurrences of a string in a big string
// if string isn't present, return an empty array

// Sample test case

//String -> I liked the movie, acting in movie was great!
//word -> movie
//Expected Output -> [12, 29]

public class Strings_Question1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		String[] sarray = s.split(" ");
		
		String word = scan.next();
		
		ArrayList<Integer> result = searchAll(sarray, sarray.length, word);
		
		System.out.println(result);
		
	}
	
	public static ArrayList<Integer> searchAll(String[] arr, int n, String word){
		
		int lcount = 0;
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			
			if(arr[i].contains(word)) {
				int index = lcount + i;
				result.add(index);
			}
			
			lcount += arr[i].length();
			
		}
		
		
		return result;
	}
}
