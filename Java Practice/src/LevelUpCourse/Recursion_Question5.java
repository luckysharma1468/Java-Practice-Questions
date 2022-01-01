import java.util.*;

// Smart Keypad

// Sample Input 

// 23

// Sample Output

// AD AE AF BD BE BF CD CE CF

// Idea is

// We are passing an empty string at first instance

// then for the first charcter i.e in our case is '2' ---> "ABC"

// we are adding one character at a time to the answer and from the number string and make a
// recursion call for the second number character.

public class Recursion_Question5{

	public static HashMap<Character,String> map = new HashMap<>();

	public static void printCombinations(String s, int cc, String ans){
		if(s.length() == cc){
			System.out.println(ans);
			return;
		}

		Character num = s.charAt(cc);
		String str = map.get(num);

		for(int i=0; i<str.length(); i++){
			printCombinations(s, cc+1, ans+str.charAt(i));
		}

	}

	public static void main(String[] args) {
		String s = "133";
		map.put('1', "");
		map.put('2', "ABC");
		map.put('3', "DEF");
		map.put('4', "GHI");
		map.put('5', "JKL");
		map.put('6', "MNO");
		map.put('7', "PQRS");
		map.put('8', "TUV");
		map.put('9', "XYZ");

		printCombinations(s, 0, "");
	}
}