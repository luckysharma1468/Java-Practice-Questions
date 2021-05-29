package DP;

public class countSubsetSum {
	
	public static int countSubsetSum(int[] arr, int n, int sum) {
		int[][] strg = new int[n+1][sum+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++) {
				if(j == 0) {
					strg[i][j] = 1;
				}
				else if(i == 0) {
					strg[i][j] = 0;
				}
				else if(arr[i-1] <= j) {
					strg[i][j] = strg[i-1][j-arr[i-1]] + strg[i-1][j]; 
				}else {
					strg[i][j] = strg[i-1][j];
				}
			}
		}
		
		return strg[n][sum];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, 3, 5, 6, 8, 10};
		int sum = 10;
		
		System.out.println(countSubsetSum(arr, arr.length, sum));

	}

}
