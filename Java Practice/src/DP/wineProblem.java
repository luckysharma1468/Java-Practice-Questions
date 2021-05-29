package DP;

public class wineProblem {
	
	public static int wineProblem(int[] arr, int si, int ei, int y) {
		if(si == ei) {
			return y*arr[si];
		}
		
		int takenLeft = wineProblem(arr, si+1, ei, y+1) + y*arr[si];
		int takenRight = wineProblem(arr, si, ei-1, y+1) + y*arr[ei];
		
		int ans = Math.max(takenLeft, takenRight);
		
		return ans;
	}
	
	public static int wineProblemTD(int[] arr, int si, int ei, int y, int[][] strg) {
		if(si == ei) {
			return y*arr[si];
		}
		
		if(strg[si][ei] != 0) {
			return strg[si][ei];
		}
		
		int takenLeft = wineProblemTD(arr, si+1, ei, y+1, strg) + y*arr[si];
		int takenRight = wineProblemTD(arr, si, ei-1, y+1, strg) + y*arr[ei];
		
		int ans = Math.max(takenLeft, takenRight);
		
		strg[si][ei] = ans;
		
		return ans;
	}
	
	public static int wineProblemBU(int[] arr) {
		int[][] strg = new int[arr.length][arr.length];
		
		for(int i=arr.length-1; i>=0; i++) {
			for(int j=i; j<arr.length; j++) {
				
				int yr = arr.length - (j - i +1) + 1;
				
				if(i == j) {
					strg[i][j] = arr[j]*yr;
				}else {
					int left = strg[i][j-1] + arr[j]*yr;
					int bottom = strg[i+1][j] + arr[j]*yr;
					
					strg[i][j] = Math.max(left, bottom);
				}
			}
		}
		
		return strg[0][arr.length-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, 3, 5, 1, 4};
		
//		int[] arr = new int[1000];
		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i;
//		}
		
		
//		System.out.println(wineProblem(arr, 0, arr.length-1, 1));
		
		int[][] strg = new int[arr.length][arr.length];
		
		System.out.println(wineProblemTD(arr, 0, arr.length-1, 1, strg));
		
		System.out.println(wineProblemBU(arr));
		

	}

}
