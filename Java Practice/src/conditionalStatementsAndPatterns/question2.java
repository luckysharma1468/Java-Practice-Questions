package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 *	Given Binary numbers , convert them to Integer
 * 
 *  Input Format
The first line contains N , the number of binary numbers. Next N lines contain N integers each representing binary represenation of number.

Constraints
N<=1000 Digits in binary representation is <=16.

Output Format
N lines,each containing a decimal equivalent of the binary number.
 * 
 * Sample Input
	4
	101
	1111
	00110
	111111
Sample Output
	5
	15
	6
	63
 */

public class question2 {
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for(int i=1; i<=n; i++){

			int binary = scan.nextInt();

			int two = 1;
			int result = 0;
			while(binary >= 10){
				int last = binary % 10;
				if(last == 1) {
					result += (last * two);
				}
				
				two *= 2;
				binary = binary/10;
				
			}
			
			result += (binary*two);
			
			System.out.println(result);

		}
    }
}
