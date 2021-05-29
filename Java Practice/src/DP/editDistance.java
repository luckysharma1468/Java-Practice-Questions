package DP;

public class editDistance {

	public static int EditDistance(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int count = 0;

		if (ch1 == ch2) {
			count = EditDistance(ros1, ros2);
		} else {
			int i = EditDistance(ros1, s2);
			int d = EditDistance(s1, ros2);
			int r = EditDistance(ros1, ros2);

			count = 1 + Math.min(i, Math.min(d, r));
		}

		return count;
	}

	public static int EditDistanceTD(String s1, String s2, int adx, int bdx, int[][] strg) {

		if (s1.length() == adx || s2.length() == bdx) {
			return Math.max(s1.length() - adx, s2.length() - bdx);
		}

		char ch1 = s1.charAt(adx);
		char ch2 = s2.charAt(bdx);

		if (strg[adx][bdx] != 0) {
			return strg[adx][bdx];
		}

		int count = 0;

		if (ch1 == ch2) {
			count = EditDistanceTD(s1, s2, adx + 1, bdx + 1, strg);
		} else {
			int i = EditDistanceTD(s1, s2, adx + 1, bdx, strg);
			int d = EditDistanceTD(s1, s2, adx, bdx + 1, strg);
			int r = EditDistanceTD(s1, s2, adx + 1, bdx + 1, strg);

			count = 1 + Math.min(i, Math.min(d, r));
		}

		strg[adx][bdx] = count;

		return count;
	}

	public static int EditDistanceBU(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		
		int[][] strg = new int[n1+1][n2+1];
		
		for(int row = n1; row>=0; row--) {
			for(int col= n2; col >=0 ; col--) {
				
				if(row == n1) {
					strg[row][col] = n2-col;
				}else if(col == n2) {
					strg[row][col] = n1 - row;
				}else {
					
					if(s1.charAt(row) == s2.charAt(col)) {
						strg[row][col] = strg[row+1][col+1];
					}else {
						int i = strg[row+1][col];
						int d = strg[row][col+1];
						int r = strg[row+1][col+1];
						
						strg[row][col] = 1 + Math.min(i, Math.min(d,  r));
					}
				}
			}
		}
		
		return strg[0][0];
	}

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "agcfd";

//		System.out.println(EditDistance(s1, s2));

		System.out.println(EditDistanceTD(s1, s2, 0, 0, new int[s1.length()][s2.length()]));
		
		System.out.println(EditDistanceBU(s1, s2));
	}
}
