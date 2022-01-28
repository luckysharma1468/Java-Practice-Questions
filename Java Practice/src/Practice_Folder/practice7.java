import java.util.*;

// s ---> hello ----> hel*lo
// hello ---> helo <--- Homework


// s ---> abbc ---> bbc --> bc --> c

public class practice7{

	public static String addCharacterInDuplicate(String s){
		// Base Case
		if(s.length() == 1){
			return s;
		}

		// Recursive Case
		char ch = s.charAt(0);
		String recResult = addCharacterInDuplicate(s.substring(1));

		if(ch == recResult.charAt(0)){
			recResult = ("" + ch + "*" + recResult);
		}else{
			recResult = (""+ch+recResult);
		}

		return recResult;
	}

	public static void main(String[] args) {
		String s = "abbc";
		System.out.println(addCharacterInDuplicate(s));
	}
}