package Backtracking;

public class NKnights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[][] board = new boolean[3][3];

		nKnights(board, 0, 0, 0, board.length, "");

	}

	static int count = 0;

	public static void nKnights(boolean[][] board, int row, int col, int kpsf, int tk, String ans) {
		if (tk == kpsf) {

			System.out.println(++count + ". " + ans);
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;
		}

		if (row == board.length) {
			return;
		}

		if (isItSafeToPlaceAKnight(board, row, col)) {
			board[row][col] = true;
			nKnights(board, row, col + 1, kpsf + 1, tk, ans + "{" + row + "-" + col + "}");
			board[row][col] = false;

		}

		nKnights(board, row, col + 1, kpsf, tk, ans);

	}

	private static boolean isItSafeToPlaceAKnight(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub

		int[] rowArr = { -1, -2, -2, -1 };
		int[] colArr = { 2, 1, -1, -2 };

		for (int i = 0; i < 4; i++) {

			int r = row + rowArr[i];
			int c = col + colArr[i];

			if (r >= 0 && r < board.length && c >= 0 && c < board[0].length) {

				if (board[r][c]) {
					return false;
				}
			}
		}

		return true;
	}

}
