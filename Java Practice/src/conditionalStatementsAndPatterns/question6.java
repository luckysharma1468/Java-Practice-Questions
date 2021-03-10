package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Given coefficients of a quadratic equation , 
 * you need to print the nature of the roots (Real and Distinct , Real 
 * and Equal or Imaginary) and the roots.
If Real and Distinct , print the roots in increasing order.
If Real and Equal , print the same repeating root twice
If Imaginary , no need to print the roots.

Note : Print only the integer part of the roots.

Input Format
First line contains three integer coefficients a,b,c 
for the equation ax^2 + bx + c = 0.

Constraints
-100 <= a, b, c <= 100

Output Format
Output contains one/two lines. First line contains 
nature of the roots .The next line contains roots(in non-decreasing order)
 separated by a space if they exist. If roots are imaginary
  do not print the roots. Output the integer values for the roots.

Sample Input
1 -11 28
Sample Output
Real and Distinct
4 7
Explanation
The input corresponds to equation ax^2 + bx + c = 0. 
Roots = (-b + sqrt(b^2 - 4ac))/2a , (-b - sqrt(b^2 - 4ac))/2a
 */

public class question6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int D = ((b * b) - 4 * a * c);

		D = D > 0 ? (int) Math.sqrt(D) : D;

		int root1 = (-(b) + D) / (2 * a);
		int root2 = ((-b) - D) / (2 * a);

		if (D == 0) {
			System.out.println("Real and Equal");
			int r = -b / (2 * a);
			System.out.println(r + " " + r);

		} else if (D > 0) {
			System.out.println("Real and Distinct");
			System.out.println((root1 > root2 ? root2 : root1) + " " + (root1 > root2 ? root1 : root2));
		} else {
			System.out.println("Imaginary");
			System.out.println(" ");
		}
	}
}
