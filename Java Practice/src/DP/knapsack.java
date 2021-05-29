package DP;

public class knapsack {
	
	public static int knapsack(int[] W, int[] P, int curr, int MW) {
		
		if(curr == W.length || MW == 0) {
			return 0;
		}
		
		int maxProfit = 0;
		if(W[curr] <= MW) {
			
			int consider = knapsack(W, P, curr+1, MW-W[curr]) + P[curr];
			int notConsider = knapsack(W, P, curr+1, MW);
			
			maxProfit = Math.max(consider, notConsider);
		}else {
			maxProfit = knapsack(W, P, curr+1, MW);
		}
		
		return maxProfit;
	}
	
	public static int knapsackTD(int[] W, int[] P, int curr, int MW, int[][] strg) {
		
		if(curr == W.length || MW == 0) {
			return 0;
		}
		
		if(strg[curr][MW] != 0) {
			return strg[curr][MW];
		}
		
		int maxProfit = 0;
		if(W[curr] <= MW) {
			
			int consider = knapsack(W, P, curr+1, MW-W[curr]) + P[curr];
			int notConsider = knapsack(W, P, curr+1, MW);
			
			maxProfit = Math.max(consider, notConsider);
		}else {
			maxProfit = knapsack(W, P, curr+1, MW);
		}
		
		strg[curr][MW] = maxProfit;
		
		return maxProfit;
	}
	
	public static int knapsackBU(int[] wt, int[] p, int MW) {
		int[][] strg = new int[wt.length+1][MW+1];
		
		for(int i=wt.length-1; i>=0; i-- ) {
			for(int j=1; j<=MW; j++) {
				
				int e = strg[i+1][j];
				int include = 0;
				
				if(wt[i] <= j) {
					include = strg[i+1][j-wt[i]] + p[i];
				}
				
				strg[i][j] = Math.max(e,  include);
			}
		}
		
		return strg[0][MW];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        
        int[][] strg = new int[wt.length+1][W+1];
        
        System.out.println(knapsackTD(wt, val, 0, W, strg));
        System.out.println(knapsackBU(wt, val, W));

	}

}
