package DP;

import java.util.Arrays;

public class mazepath {
	
	public static int countMazePathWays(int cr, int cc, int er, int ec) {
		if(cr == er && cc == ec) {
			return 1;
		}
		
		if(cr > er || cc > ec) {
			return 0;
		}
		
		int count = 0;
		
		int horizontal = countMazePathWays(cr, cc+1, er, ec);
		int vertical = countMazePathWays(cr+1, cc, er, ec);
		
		count += (horizontal + vertical);
		
		return count;
	}
	
	public static int countMazePathWaysTD(int cr, int cc, int er, int ec, int[][] strg) {
		if(cr == er && cc == ec) {
			return 1;
		}
		
		if(cr > er || cc > ec) { 
			return 0;
		}
		
		if(strg[cr][cc] != 0) {
			return strg[cr][cc];
		}
		
		int count = 0;
		
		int horizontal = countMazePathWaysTD(cr, cc+1, er, ec, strg);
		int vertical = countMazePathWaysTD(cr+1, cc, er, ec, strg);
		
		count = (horizontal + vertical);
		
		strg[cr][cc] = count;
		
		return count;
	}
	
	public static int output(int cr, int cc, int er, int ec) {
		int count = 0;
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		count = count + output(cr + 1, cc, er, ec);
		count = count + output(cr, cc + 1, er, ec);

		return count;
	}
	
	public static int countMazePathBU(int cr, int cc, int er, int ec) {
		int[][] strg = new int[er+2][ec+2];
		
		for(int i=er; i>=0; i--) {
			for(int j=ec; j>=0; j--) {
				
				if(i == er && j == ec) {
					strg[i][j] = 1;
				}else {
					int ch = strg[i][j+1];
					int cv = strg[i+1][j];
					
					strg[i][j] = ch + cv;
				}
			}
		}
		
		return strg[0][0];
	}
	
	public static int countMazePathBUSE(int er, int ec) {
		int[] strg = new int[ec+1];
		
		Arrays.fill(strg, 1);
		
		for(int i=0; i<er; i++) {
			for(int j=ec-1; j>=0; j--) {
				strg[j] = strg[j] + strg[j+1];
			}
		}
		
		return strg[0];
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		System.out.println(countMazePathWaysTD(0, 0, n, n, new int[n+1][n+1]));
		
		System.out.println(countMazePathBU(0, 0, n, n));
		
		System.out.println(countMazePathBUSE(n, n));
		
	
	}

}
