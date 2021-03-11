package recursion;

import java.util.*;

/*
 * Print all the subsequences of a string in lexicographical order.

Input Format
First line contains an integer N, the no of strings.
Next, N lines follows one string per line.

Constraints
1 < len(str) < 20

Output Format
No of subsequences one per line

Sample Input
1  
ab
Sample Output
  
a  
ab  
b  
Explanation
4 subsequences are printed.
Empty string is a subsequence.
 */

public class question2 {
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();

		while(n > 0){

			String s = scan.nextLine();

			ArrayList<String> result = getSS(s);

			Collections.sort(result);

			for(String i: result){
				System.out.println(i);
			}

			n--;
		}
    }

	public static ArrayList<String> getSS(String s){

		if(s.length() == 0){
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}

		char cc = s.charAt(0);
		String ros = s.substring(1);

		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> recRos = getSS(ros);

		result.addAll(recRos);

		for(int i=0; i<recRos.size(); i++){
			String temp = ""+ cc + recRos.get(i);
			result.add(temp);
		}

		return result;
	}
}
