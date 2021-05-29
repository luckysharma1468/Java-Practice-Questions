package DP;

public class LCS {
	
	public static int LCS(String s1, String s2) {
		if(s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		
		int count = 0;
		
		if(s1.charAt(0) == s2.charAt(0)) {
			count = 1 + LCS(s1.substring(1), s2.substring(1));
		}else {
			count = Math.max(LCS(s1.substring(1), s2), LCS(s1, s2.substring(1)));
		}
		
		return count;
	}
	
	public static int LCS(int adx, int bdx, String s1, String s2, int[][] strg) {
		if(adx == s1.length() || bdx == s2.length()) {
			return 0;
		}
		
		if(strg[adx][bdx] != 0) {
			return strg[adx][bdx];
		}
		
		int count = 0;
		if(s1.charAt(adx) == s2.charAt(bdx)) {
			count = 1 + LCS(adx+1, bdx+1, s1, s2, strg);
		}else {
			count = Math.max(LCS(adx+1, bdx, s1, s2, strg), LCS(adx, bdx+1, s1, s2, strg));
		}
		
		strg[adx][bdx] = count;
		
		return count;
		
	}
	
	public static int LCSBU(int n1, int n2, String s1, String s2) {
		int[][] strg = new int[n1+1][n2+1];
		
		for(int i=n1-1; i>=0; i--) {
			for(int j=n2-1; j>=0; j--) {
				if(s1.charAt(i) == s2.charAt(j)) {
					strg[i][j] = strg[i+1][j+1] + 1;
				}else {
					strg[i][j] = Math.max(strg[i][j+1], strg[i+1][j]);
				}
			}
		}
		
		return strg[0][0];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "akadjasjdjhsagljakscbjlvsaclhvasjlvcjsavcgasgcdjsabcd";
		String s2 = "agcfdjavkjcvkjasvcjvajkcvaskjajvcjvacjvasjkcv";
		
		int n1 = s1.length();
		int n2 = s2.length();
		
//		System.out.println(LCS(s1, s2));
		
		System.out.println(LCS(0, 0, s1, s2, new int[n1][n2]));
		
		System.out.println(LCSBU(n1, n2, s1, s2));
	}

}
