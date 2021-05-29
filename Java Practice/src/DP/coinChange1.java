package DP;

public class coinChange1 {
	
	public static int countMaxCoinChange(int[] coins, int n,  int sum) {
		int[][] strg = new int[n+1][sum+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++) {
				if(j == 0) {
					strg[i][j] = 1;
				}
				else if( i == 0) {
					strg[i][j] = 0;
				}
				else if(coins[i-1] <= j) {
					strg[i][j] = strg[i][j-coins[i-1]] + strg[i-1][j];
				}
				else {
					strg[i][j] = strg[i-1][j];
				}
			}
		}
		
		return strg[n][sum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] coins = {1, 2, 3};
		int sum = 5;
		int n = coins.length;
		
		System.out.println(countMaxCoinChange(coins, n, sum));

	}

}
