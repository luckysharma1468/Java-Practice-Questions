package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take as input N, a number. Print the pattern as given in the input and output section.

Input Format
Enter value of N

Constraints
1 <= N < 10

Output Format
Print the pattern.

Sample Input
7
Sample Output
 1******
 12*****
 123****
 1234***
 12345**
 123456*
 1234567
Explanation
There is no space between any two numbers. Catch the pattern for corresponding input and print them accordingly.
 */

public class question23 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int nst = n-1;
		int nv = 1;

		for(int i=1; i<=n; i++){

			//values

			for(int j=1; j<=nv; j++){
				System.out.print(j);
			}

			//stars

			for(int j=1; j<=nst; j++){
				System.out.print("*");
			}

			nv++;
			nst--;

			System.out.println();
		}
    }
	
}
