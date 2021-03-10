package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take N as input, Calculate it's reverse also Print the reverse.

	Input Format
	Constraints
	0 <= N <= 1000000000
	
	Output Format
	Sample Input
	123456789
	Sample Output
	987654321
	Explanation
	You've to calculate the reverse in a number, not just print the reverse.
 */

public class question9 {
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int rev = 0;
		
		while(n >= 10) {
			rev = (rev*10) + (n%10);
			n = n/10;
		}
		
		rev = (rev*10) + (n%10);
		
		System.out.println(rev);
		
		scan.close();
    }
}
