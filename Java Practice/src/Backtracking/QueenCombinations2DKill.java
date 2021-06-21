package Backtracking;

public class QueenCombinations2DKill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[3][4];

		queenCombination2DKill(board, 0, 0, 3, 0, "");

	}

	public static void queenCombination2DKill(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {
		if(tq == qpsf) {
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
		
		if(isItSafeToPlaceAQueen(board, row, col)) {
			board[row][col] = true;
			queenCombination2DKill(board, row, col+1, tq, qpsf+1, ans+"{"+row + "-" + col + "}" );
			board[row][col] = false;
		}
		
		
		queenCombination2DKill(board, row, col+1, tq, qpsf, ans);
	}

	public static boolean isItSafeToPlaceAQueen(boolean[][] board, int row, int col) {

		// vertically upward

		int r = row - 1;
		int c = col;

		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}

			r--;
		}

		// horizontally left

		r = row;
		c = col - 1;

		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}

			c--;
		}
		
		//diagonally left
		
		r = row-1;
		c = col-1;
		
		while(r >= 0 && c >= 0) {
			if(board[r][c]) {
				return false;
			}
			
			r--;
			c--;
		}
		
		//diagonally right
		
		r = row -1;
		c = col+1;
		
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
