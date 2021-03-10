package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.

Input Format
A list of integers to be processed

Constraints
All numbers input are integers between -1000 and 1000.

Output Format
Print all the numbers before the cumulative sum become negative.

Sample Input
1
2
88
-100
49
Sample Output
1
2
88
 */

public class question3 {
	 public static void main(String args[]) {
			Scanner scan = new Scanner(System.in);
			int sum = 0;
			while(scan.hasNext()){
				int a = scan.nextInt();

				if( (sum + a) >= 0){
					System.out.println(a);
					sum +=a;
				}else{
					break;
				}

			}
	    }
}
