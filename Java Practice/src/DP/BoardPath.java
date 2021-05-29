package DP;

public class BoardPath {
	
	public static int countWays(int start, int end, int curr) {
		if(curr == end) {
			return 1;
		}
		
		if(curr > end) {
			return 0;
		}
		
		int count = 0;
		
		for(int i=1; i<=6; i++) {
			count += countWays(start, end, curr+i);
		}
		
		return count;
	}
	
	public static int BPTD(int start, int end, int[] strg) {
		if(start == end) {
			return 1;
		}
		
		if(start > end) {
			return 0;
		}
		
		if(strg[start] != 0) {
			return strg[start];
		}
		
		int count = 0;
		
		for(int i=1; i<=6; i++) {
			count += BPTD(start+i, end, strg);
		}
		
		strg[start] = count;
		
		return count;
	}
	
	public static int BPBU(int end) {
		int[] strg = new int[end+6];
		
		strg[end] = 1;
		
		for(int i=end-1; i>=0; i--) {
			int sum = 0;
			
			for(int j=i+1; j <= i+6; j++) {
				sum += strg[j];
			}
			
			strg[i] = sum;
		}
		
		return strg[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(countWays(0 , 10, 0));
		
//		System.out.println(BPTD(0, 1000, new int[10]));
		
		System.out.println(BPBU(1000));

	}

}
