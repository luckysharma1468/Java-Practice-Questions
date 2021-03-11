package recursion;

import java.util.Scanner;

/*
 * Replace all occurrences of pi with 3.14

Input Format
Integer N, no of lines with one string per line

Constraints
0 < N < 1000
0 <= len(str) < 1000

Output Format
Output result one per line

Sample Input
3
xpix
xabpixx3.15x
xpipippixx
Sample Output
x3.14x
xab3.14xx3.15x
x3.143.14p3.14xx
Explanation
All occurrences of pi have been replaced with "3.14".
 */

public class question1 {
    public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();

		while(n > 0){
			String s = scan.nextLine();
			replacePi(s, "", 0);
			n--;
		}
    }

	public static void replacePi(String s, String ans, int ci){

		if(s.length() == ci){
			System.out.println(ans);
			return;
		}

		char cc = s.charAt(ci);
		char nc = 'a';
		if ( (ci+1)< s.length() ){
			nc = s.charAt(ci+1);
		}

	

		if(cc != 'p'){
			replacePi(s, ans+cc, ci+1);
		}else if(  ((ci+1) < s.length()) && (cc == 'p' && nc != 'i') ){
			replacePi(s, ans+cc, ci+1);
		}else{
			replacePi(s, ans+"3.14", ci+2);
		}
	}
}
