package Backtracking;

public class coinChangeCoinRespect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coinChangeCoinRespec(new int[] {2, 3,  5}, 0, 10, "");
	}
	
	public static void coinChangeCoinRespec(int[] coins, int vindx, int amount, String ans) {
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		if(amount < 0 || vindx == coins.length) {
			return;
		}
		
		coinChangeCoinRespec(coins, vindx, amount-coins[vindx], ans+coins[vindx]);
		
		coinChangeCoinRespec(coins, vindx+1, amount, ans);
	}

}
