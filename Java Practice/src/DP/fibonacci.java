package DP;

public class fibonacci {
	
	public static int fib(int n) {
		if(n== 0 || n== 1) {
			return n;
		}
		
		int a = fib(n-1);
		int b = fib(n-2);
		
		int c = a + b;
		
		return c;
	}
	
	public static long fibTD(int n, long[] strg) {
		if(n== 0 || n== 1) {
			return n;
		}
		
		if(strg[n] != 0) {
			return strg[n];
		}
		
		long a = fibTD(n-1, strg);
		long b = fibTD(n-2, strg);
		
		long c = a + b;
		
		strg[n] = c;
		
		return c;
	}
	
	public static int fibBU(int n) {
		int[] strg = new int[n+1];
		
		strg[0] = 0;
		strg[1] = 1;
		
		for(int i=2; i<=n ; i++) {
			strg[i] = strg[i-1] + strg[i-2];
		}
		
		return strg[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(fib(1));
		
//		System.out.println(fibTD(6, new long[51]));
		
		System.out.println(fibBU(25));
		

	}

}
