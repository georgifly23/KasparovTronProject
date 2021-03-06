package com.kasparovtron.pieces;

public class Queen extends Piece {

	public Queen(String inputColor, int row, int col) {
		super(inputColor, row, col);

		this.power = 10;
		this.id = 6;

	}

	public boolean isMovePossible(int moveRow, int moveCol) {

		if (checkBounds(moveRow, moveCol)) {

			boolean chanceMoveRow = (moveRow != this.row);
			boolean chanceMoveCol = (moveCol != this.col);

			int rowCoeficient = this.row - moveRow;
			int colCoeficient = this.col - moveCol;

			if (chanceMoveRow && !chanceMoveCol) {
				return true;
			} else if (!chanceMoveRow && chanceMoveCol) {
				return true;
			} else if (Math.abs(rowCoeficient) == Math.abs(colCoeficient)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkBounds(int moveRow, int moveCol) {

		boolean checkRowBound = (moveRow >= 0 && moveRow <= 9);
		boolean checkColBound = (moveCol >= 0 && moveCol <= 9);

		return checkColBound && checkRowBound;

	}

	public void move(int moveRow, int moveCol) {

		if (this.isMovePossible(moveRow, moveCol)) {

			this.row = moveRow;
			this.col = moveCol;
		}

	}

	public void attack(int attackRow, int attackCol) {
		this.row = attackRow;
		this.col = attackCol;
	}

	@Override
	public String getName() {
		String name = "Queen";
		return name;
	}


}
