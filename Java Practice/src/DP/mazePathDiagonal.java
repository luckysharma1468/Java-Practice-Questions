package DP;

import java.util.Arrays;

public class mazePathDiagonal {
	
	public static int mazePathDiagonal(int cr, int cc, int er, int ec) {
		if(cr == er && cc == ec) {
			return 1;
		}
		
		if(cr > er || cc > ec) {
			return 0;
		}
		
		int h = mazePathDiagonal(cr, cc+1, er, ec);
		int v = mazePathDiagonal(cr+1, cc, er, ec);
		int d = mazePathDiagonal(cr+1, cc+1, er, ec);
		
		return (h+v+d);
	}
	
	public static int mazePathDiagonalTD(int cr, int cc, int er, int ec, int[][] strg) {
		if(cr == er && cc == ec) {
			return 1;
		}
		
		if(cr > er || cc > ec) {
			return 0;
		}
		
		if(strg[cr][cc] != 0) {
			return strg[cr][cc];
		}
		
		int h = mazePathDiagonalTD(cr, cc+1, er, ec, strg);
		int v = mazePathDiagonalTD(cr+1, cc, er, ec, strg);
		int d = mazePathDiagonalTD(cr+1, cc+1, er, ec, strg);
		
		strg[cr][cc] = (h+v+d);
		
		return (h+v+d);
	}
	
	public static int mazePathDiagonalBU(int er, int ec) {
		int[][] strg = new int[er+2][ec+2];
		
		for(int i=er; i>=0; i--) {
			for(int j=ec; j>=0; j--) {
				if(i == er && j == ec) {
					strg[i][j] = 1;
				}else {
					strg[i][j] = strg[i+1][j] + strg[i][j+1] + strg[i+1][j+1];
				}
			}
		}
		
		return strg[0][0];
	}
	
	public static int countMazePathBUSE(int er, int ec) {
		int[] strg = new int[ec+1];
		
		Arrays.fill(strg, 1);
		
		for(int i=0; i<er; i++) {
			int diag = 1;
			for(int j=ec-1; j>=0; j--) {
				int sum = strg[j] + strg[j+1] + diag;
				diag = strg[j];
				strg[j] = sum;
			}
		}
		
		return strg[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		
//		System.out.println(mazePathDiagonal(0, 0, n, n));
		
//		System.out.println(mazePathDiagonalTD(0, 0, n, n, new int[n+1][n+1]));
		
		System.out.println(mazePathDiagonalBU(n, n));
		
		System.out.println(countMazePathBUSE(n, n));
	}

}
