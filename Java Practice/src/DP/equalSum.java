package DP; 

import java.util.*;
class equalSum {

	public static boolean subsetSum(int[] arr, int n, int sum){
		boolean[][] strg = new boolean[n+1][sum+1];

		for(int i=0; i<n+1; i++){
			for(int j=0; j<sum+1; j++){
				if(j == 0){
					strg[i][j] = true;
				}
				else if(i == 0){
					strg[i][j] = false;
				}
				else if(arr[i-1] <= j){
					strg[i][j] = strg[i-1][j-arr[i-1]] || strg[i-1][j];
				}else{
					strg[i][j] = strg[i-1][j];
				}
			}
		}

		return strg[n][sum];
	}

    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}
		
		int sum = 0;
		
		for(int i: arr) {
			sum+=i;
		}
		
		if(sum % 2 != 0) {
			System.out.println("NO");
		}else {
			System.out.println(subsetSum(arr, n, sum/2) == true ? "Yes" : "No");
		}

		

    }
}