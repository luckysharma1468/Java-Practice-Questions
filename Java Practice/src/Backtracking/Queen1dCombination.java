package Backtracking;

public class Queen1dCombination {

	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] box = new boolean[4];
		Queen1dCombination(box, 2, 0, "", -1);

	}
	
	public static void Queen1dCombination(boolean[] box, int tq, int qpsf, String ans, int lastBoxUsed)
	{
		if(tq == qpsf) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		
		for(int i=lastBoxUsed+1; i<box.length; i++) {
			
			box[i] = true;
			Queen1dCombination(box, tq, qpsf+1, ans+"q"+qpsf+"b"+i, i);
			box[i] = false;
		}
	}
}
