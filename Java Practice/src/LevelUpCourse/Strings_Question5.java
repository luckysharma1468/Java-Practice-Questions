package LevelUpCourse;

import java.util.*;

// Sorting string subsequences
// first by length then lexographically

// Sample Input 
// abcd

// Sample Output

//  a b c d ab ac ad bc bd cd abc abd acd bcd abcd

public class Strings_Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		ArrayList<String> result = generateSS(s);
		
		Collections.sort(result, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}else {
					return s1.length() > s2.length() ? 1 : -1;
				}
			}
		});
		
		for(String si: result) {
			System.out.print(si + " ");
		}
	}
	
	public static ArrayList<String> generateSS(String s){
		if(s.length() == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		
		char cc = s.charAt(0);
		String ros = s.substring(1);
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> recRos = generateSS(ros);
		
		
		result.addAll(recRos);
		
		for(int i=0; i<recRos.size(); i++) {
			String temp = "" + cc + recRos.get(i);
			result.add(temp);
 		}
		
		return result;
	}

}
