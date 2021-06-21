package DP;

import java.util.*;


public class main {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int q = scan.nextInt();
		
		Stack<Integer> A = new Stack<>();
		
		for(int i=0; i<n; i++) {
			int item = scan.nextInt();
			A.push(item);
		}
		
		generatePrimeNumbers();
		
		
		Stack<Integer> Ai = new Stack<>();
		Stack<Integer> Bi = new Stack<>();
		
		for(int i=1; i<=q; i++) {
			while(!A.isEmpty()) {
				int ele = A.pop();
				if(ele%getIthPrimeNumber(i) == 0) {
					Bi.push(ele);
				}else {
					Ai.push(ele);
				}
			}
			
		}
		
		System.out.println(getIthPrimeNumber(1));
		System.out.println(Ai);
		System.out.println(Bi);
		
		while(!Bi.isEmpty()) {
			System.out.println(Bi.pop());
		}
		
		while(!Ai.isEmpty()) {
			System.out.println(Ai.pop());
		}
		
    }
	
	static int MAX_SIZE = 1000000;
	static boolean[] prime = new boolean[MAX_SIZE-1];
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void generatePrimeNumbers() {
		
		for(int i=0; i<MAX_SIZE-2; i++) {
			prime[i] = true;
		}
		
		for(int p=2; p*p<MAX_SIZE-2; p++) {
			
			if(prime[p]) {
				for(int i=p; i<MAX_SIZE-2; i+=p) {
					prime[i] = false;
				}
			}
		}
		
		for(int i= 2; i<MAX_SIZE-2; i++) {
			if(prime[i]) {
				list.add(i);
			}
			
		}
	}
	
	public static int getIthPrimeNumber(int ith) {
		return list.get(ith);
	}

}