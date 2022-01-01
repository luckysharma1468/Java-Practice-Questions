import java.util.*;

// Generate Balanced Paranthesis for the given integer

// Sample Input

// N = 2

// Sample Output 

// ()()
// (())

// Time Complexity for this case is O(2^N)

public class Recursion_Question4{

	public static void generateParanthesis(int n, int tp, int cp, int open, int close,String ans){
		if(cp == tp){
			System.out.println(ans);
			return;
		}


		if(open < n){
			generateParanthesis(n, tp, cp+1, open+1, close, ans+"(");
		}
		
		if (close < open){
			generateParanthesis(n, tp, cp+1, open, close+1, ans+")");
		}
	}

	public static void main(String[] args) {
		int n = 2;
		int tp = n*2;
		generateParanthesis(n, tp, 0, 0, 0, "");
	}
}