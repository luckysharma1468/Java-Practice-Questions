package recursion;

public class coinChange {

	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		coinChangeCombination(new int[] {2,  3,  5,  6}, 10, "", 0);
		coinChangeP(new int[] {2, 3, 5, 6}, 10, "");
	}

	public static void coinChangeCombination(int[] denom, int amount, String ans, int lastdenoUsed)
	{
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=lastdenoUsed; i<denom.length; i++) {
			if(amount >=  denom[i]) {
				coinChangeCombination(denom, amount-denom[i], ans+denom[i], i);
			}
		}
	}
	
	public static void coinChangeP(int[] denom, int amount, String ans) {
		if(amount == 0) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		
		for(int i=0; i<denom.length; i++) {
			if(amount >= denom[i]) {
				coinChangeP(denom, amount-denom[i], ans+denom[i]);
			}
		}
	}
}
