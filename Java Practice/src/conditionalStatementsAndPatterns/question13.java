package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take N (number of rows), print the following pattern (for N = 4).

                       1 
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4
	Input Format
	Constraints
	0 < N < 10
	
	Output Format
	Sample Input
	4
	Sample Output
	            1
			2	3	2
		3	4	5	4	3
	4	5	6	7	6	5	4
	Explanation
	Each number is separated from other by a tab.
 */

public class question13 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int nst = 1;
		int nsp = n-1;
		int val = 1;

		for(int i=1; i<=n; i++){

			val = i;
			//spaces
			for(int j=1; j<=nsp; j++){
				System.out.print("\t");
			}

			//values
			for(int j=1; j<=nst; j++){

				if(j == 1 || j == nst){
					System.out.print(i + "\t");
					val +=1;
				}else if(j <= nst/2){
					
					System.out.print(val + "\t");
					val +=1;
				}else {
					System.out.print(val + "\t");
					val -=1;
				}
				
			}

			//spaces
			for(int j=1; j<=nsp; j++){
				System.out.print("\t");
			}

			nst +=2;
			nsp-=1;
			System.out.println();
		}
    }
}
