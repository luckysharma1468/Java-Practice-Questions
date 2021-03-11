package recursion;

import java.util.Scanner;

/*
 * Take as input str, a number in form of a string. Write a recursive function to convert the number in string form to number in integer form. E.g. for “1234” return 1234. Print the value returned.

Input Format
Enter a number in form of a String

Constraints
1 <= Length of String <= 10

Output Format
Print the number after converting it into integer

Sample Input
1234
Sample Output
1234
Explanation
Convert the string to int. Do not use any inbuilt functions.
 */

public class question9 {

	public static void main(String args[]) {
        // Your Code Here
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		System.out.println(convertToInt(s));

    }

	public static long convertToInt(String s){
		if(s.length() == 0){
			return 0;
		}

		long CN = s.charAt(0) - '0';

		long result = convertToInt(s.substring(1));

		if(result == 0){
			result = CN;
		}else{
			long ten = 1;

			for(int i=1; i<=(""+result).length(); i++){
				ten *= 10;
			}

			result = CN*ten + result;
		}

		return result;
	}
	
}
