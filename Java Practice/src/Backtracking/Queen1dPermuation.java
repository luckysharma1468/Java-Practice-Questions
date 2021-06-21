package Backtracking;

public class Queen1dPermuation {
	
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] box = new boolean[4];
		qpermuation(box, 2, 0, "");
	}
	
	public static void qpermuation(boolean[] box, int tq, int qpsf, String ans) {
		if(tq == qpsf) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		
		for(int i=0; i<box.length; i++) {
			
			if(box[i] == false) {
				box[i] = true;
				qpermuation(box, tq, qpsf+1, ans+"q"+qpsf+"b"+i);
				box[i] = false;
			}
			
		}
	}

}
