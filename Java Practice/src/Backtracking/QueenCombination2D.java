package Backtracking;

public class QueenCombination2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		queenCombinations2D(new boolean[2][2], 0, 0, 2, 0, "");

	}

	public static void queenCombinations2D(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {
		
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
		
		board[row][col] = true;
		queenCombinations2D(board, row, col+1, tq, qpsf+1, ans+"{"+row + "-" + col + "}" );
		board[row][col] = false;
		
		queenCombinations2D(board, row, col+1, tq, qpsf, ans);
		
	}
}
