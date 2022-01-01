import java.util.*;

// Find all subsequences of a given string
// Time complexity for the given approach is O(2^N)

// As we are making 2 recursion calls at every step therefore
// the nodes become double at every level.

// Sample Input
// String s = "abc"

// Sample Output
// "", a, b, c, ab, ac, bc, abc

public class Recursion_Question2{

	public static void subsequences(String s, String ans){
		if(s.length() == 0){
			return;
		}

		subsequences(s.substring(1), ans+s.charAt(0));
		subsequences(s.substring(1), ans);
	}

	public static ArrayList<String> Rsubsequences(String s){
		if(s.length() == 0){
			ArrayList<String> tempList = new ArrayList<>();
			tempList.add("");
			return tempList;
		}

		char cc = s.charAt(0);
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> recursionResult = Rsubsequences(s.substring(1));
		
		for(int i=0; i<recursionResult.size(); i++){
			String temp = recursionResult.get(i);
			result.add(temp);
			result.add(cc+temp);
		}

		return result;
	}

	public static void main(String[] args) {
		String s = "abc";
		// subsequences(s, "");
		System.out.println(Rsubsequences(s));
	}
}