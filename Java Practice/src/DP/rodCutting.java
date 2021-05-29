package DP;

import java.util.Arrays;

public class rodCutting {
	
	public static int rodCutting(int[] price, int[] arr,int n, int length) {
		
		if(n <= 0) {
			return 0;
		}
		
		int max = 0;
		if(arr[n-1] <= length) {
			max = Math.max(price[n-1] + rodCutting(price, arr, n, length-arr[n-1]),
							rodCutting(price, arr, n-1, length));
		}else {
			max = rodCutting(price, arr, n-1, length);
		}
		
		return max;
	}
	
	public static int rodCuttingTD(int[] price, int[] arr, int n, int length, int[][] strg) {
		if(n <= 0) {
			return 0;
		}
		
		
		if(strg[n][length] != 0) {
			return strg[n][length];
		}
		
		int max = 0;
		
		if(arr[n-1] <= length) {
			max = Math.max(price[n-1] + rodCuttingTD(price, arr, n, length-arr[n-1], strg),
							rodCuttingTD(price, arr, n-1, length, strg));
		}else {
			max = rodCuttingTD(price, arr, n-1, length, strg);
		}
		
		strg[n][length] = max;
		
		return max;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int length = 8;
		
		int n = arr.length;
		
		System.out.println(rodCutting(price, arr, n, length));
		
		System.out.println(rodCuttingTD(price, arr, n, length, new int[n+1][length+1]));
		
		

	}

}
