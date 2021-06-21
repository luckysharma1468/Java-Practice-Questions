package Backtracking;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[][] board = new boolean[5][5];
		
		NQueens(board, 0, 0, board.length, 0, "");

	}
	
	public static void NQueens(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {
		
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		if(col == board[0].length) {
			row++;
			col = 0;
		}
		
		if(row == board.length) {
			return;
		}
		
		if(isItSafeToPlaceQueen(board, row, col)) {
			board[row][col] = true;
			NQueens(board, row+1, 0, tq, qpsf+1, ans+"{"+row + "-" + col + "}");
			board[row][col] = false;
		}
		
		NQueens(board, row, col+1, tq, qpsf, ans);
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
