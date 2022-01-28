import java.util.*;

// s = "abc" ---> "bc" ---> "c"  --> ""
// ["", "c", "b", "bc", "a", "ac", "ab", "abc"]
// "", a, b, c, bc, ac, ab, abc

// result ---> ["", "c"]

// O(2*N)




public class practice2{

	public static ArrayList<String> substringString(String s){
		// Base Case
		if(s.length() == 0){
			ArrayList<String> tempList = new ArrayList<>();
			tempList.add("");
			return tempList;
		}

		// Recursive Case
		char ch = s.charAt(0);
		ArrayList<String> result = new ArrayList<>();
		// Recursion Result
		ArrayList<String> recResult = substringString(s.substring(1));

		// Storing all the results
		result.addAll(recResult);

		for(int i=0; i<recResult.size(); i++){
			String temp = recResult.get(i);
			temp = ch+temp;
			result.add(temp);
		}

		return result;

	}

	public static void main(String[] args) {
		String s = "abc";
		ArrayList<String> result = substringString(s);
		Collections.sort(result);
		System.out.println(result);
	}
}