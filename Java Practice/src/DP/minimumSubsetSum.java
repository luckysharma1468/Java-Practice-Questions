package DP;

import java.util.*;

public class minimumSubsetSum {
	
	public static int minimumSubsetSum(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for(int i: arr) {
			sum +=i;
		}
		
		boolean[][] strg = new boolean[n+1][sum+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++) {
				if(j==0) {
					strg[i][j] = true;
				}
				else if (i == 0) {
					strg[i][j] = false;
				}
				else if(arr[i-1] <= j) {
					strg[i][j] = strg[i-1][j-arr[i-1]] || strg[i-1][j];
				}
				else {
					strg[i][j] = strg[i-1][j];
				}
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<=sum/2; i++) {
			if(strg[n][i]) {
				list.add(i);
			}
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<list.size(); i++) {
			min = Math.min(min, sum-2*list.get(i));
		}
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 7};
		
		System.out.println(minimumSubsetSum(arr));

	}

}
