package conditionalStatementsAndPatterns;

import java.util.Scanner;

/*
 * Sample Input - 5
 * 
 *  Sample Output
 *  
 *  1
	11
	202
	3003
	40004
 */


public class question1 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for(int i=1; i<=n; i++){

			for(int j=1; j<=i; j++){
				
				if(i == 1){
					System.out.print(1);
					break;
				}

				if(j == 1 || j == i){
					System.out.print(i-1);
				}else{
					System.out.print(0);
				}
			}

			System.out.println();
		}

    }

}
