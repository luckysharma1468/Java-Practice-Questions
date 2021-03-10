package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Take N (number of rows), print the following pattern (for N = 6)
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

Input Format
Constraints
0 < N < 100

Output Format
Sample Input
6
Sample Output
1  
1	1  
1	2	1  
1	3	3	1  
1	4	6	4	1  
1	5	10	10	5	1
Explanation
Each number is separated from other by a tab.
 */

public class question20 {
	public static int fact(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}

		return num * fact(num - 1);
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print(1);
			} else {

				for (int j = 0; j <= i; j++) {
					if (j == 0 || j == i) {
						System.out.print(1 + "\t");
					} else {
						int top = fact(i);
						int bottom = (fact(j) * fact(i - j));

						int val = top / bottom;

						System.out.print(val + "\t");
					}
				}
			}

			System.out.println();
		}

	}
}
