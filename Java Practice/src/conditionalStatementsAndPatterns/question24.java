package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take as input N, a number. Print the pattern as given in output section for corresponding input.

Input Format
Enter value of N

Constraints
Output Format
All numbers and stars are Space separated

Sample Input
5
Sample Output
1 2 3 4 5
1 2 3 4 * 
1 2 3 * * *
1 2 * * * * *
1 * * * * * * *
Explanation
Catch the pattern for the corresponding input and print them accordingly.
 */

public class question24 {
	
	  public static void main(String args[]) {
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();

			int nv = n;
			int nst = -1;

			for(int i=1; i<=n; i++){

				//nv

				for(int j=1; j<=nv; j++){
					System.out.print(j + " ");
				}

				//nst

				for(int j=1; j<=nst; j++){
					System.out.print("* ");
				}

				nv--;
				nst+=2;
				
				
				System.out.println();
			}
	    }

}
