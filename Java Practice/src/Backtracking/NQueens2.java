package Backtracking;

public class NQueens2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[][] board = new boolean[4][4];
		nQueens2(board, 0, 0, 3, "");

	}
	
	static int count = 0;
	
	public static void nQueens2(boolean[][] board, int row, int qpsf, int tq, String ans) {
		
		if(tq == qpsf) {
			System.out.println(++count + ". " + ans);
			return;
		}
		
		if(row == board.length) {
			return;
		}
		
		//options 
		for(int col=0; col < board[0].length; col++) {
			
			if(isItSafeToPlaceQueen(board, row, col)) {
				board[row][col] = true;
				nQueens2(board, row+1, qpsf+1, tq, ans+"{"+row + "-" + col + "}");
				board[row][col] = false;
			}
			
		}
		
		//not place
		nQueens2(board, row+1, qpsf, tq, ans);
		
	}
	
	private static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		
		//vertically upward
		
		int r = row - 1;
		int c = col;
		
		while(r >= 0) {
			if(board[r][c]) {
				return false;
			}
			
			r--;
		}
		
		// horizontally left
		
		r = row;
		c = col -1;
		
		while(c >= 0) {
			if(board[r][c]) {
				return false;
			}
			
			c--;
		}
		
		// diagonally left
		
		r = row-1;
		c = col-1;
		
		while(r>=0 && c>=0) {
			if(board[r][c]) {
				return false;
			}
			
			r--;
			c--;
		}
		
		//diagonally right
		
		r = row -1;
		c = col +1;
		
		while(r >= 0 && c < board[0].length) {
			if(board[r][c]) {
				return false;
			}
			
			r--;
			c++;
		}
		
		return true;
	}

}
