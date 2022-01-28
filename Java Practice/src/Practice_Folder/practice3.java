import java.util.*;

// s = "abcd" --> "bcd" --> "cd" ---> "d" --> ""

// "" --> "d" --> "dc" --> "dcb" ---> "dcba"

// O(2*N)

public class practice3{

	public static String reverseString(String s){
		// Base Case
		if(s.length() == 0){
			return "";
		}

		// Recursion Case
		char ch = s.charAt(0);
		String recResult = reverseString(s.substring(1));
		recResult = recResult + (""+ch); 

		return recResult;
	}

	public static void main(String[] args) {
		System.out.println(reverseString("abcd"));
	}
}