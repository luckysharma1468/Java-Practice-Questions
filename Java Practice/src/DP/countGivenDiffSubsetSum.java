package DP;

public class countGivenDiffSubsetSum {
	
	public static int countGivenDiffSubsetSum(int[] arr, int diff, int n) {
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		
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
				}
				else {
					strg[i][j] = strg[i-1][j];
				}
			}
		}
		
		int subsetSum = (diff + sum)/2;
		
		int count = strg[n][subsetSum];
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 1, 2, 3};
		
		int n = arr.length;
		int diff = 1;
		
		System.out.println(countGivenDiffSubsetSum(arr, diff, n));

	}

}
