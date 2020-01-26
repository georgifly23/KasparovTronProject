package com.kasparovtron.pieces;

public class King extends Piece {

	public King(String inputColor, int row, int col) {
		super(inputColor, row, col);

		this.power = 5;
		this.id = 3;

	}

	public boolean isMovePossible(int moveRow, int moveCol) {

		if (checkBounds(moveRow, moveCol)) {

			boolean chanceMoveRow = (moveRow != this.row);
			boolean chanceMoveCol = (moveCol != this.col);

			int moveRowCoeficient = (this.row - moveRow);
			int moveColCoeficient = (this.col - moveCol);

			boolean moveRowPossible = (moveRowCoeficient == 1 || moveRowCoeficient == -1);
			boolean moveColPossible = (moveColCoeficient == 1 || moveColCoeficient == -1);

			if (chanceMoveRow && !chanceMoveCol) {
				return moveRowPossible;
			} else if (!chanceMoveRow && chanceMoveCol) {
				return moveColPossible;
			} else if (chanceMoveRow && chanceMoveCol) {
				return moveRowPossible && moveColPossible;
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
		String name = "King";
		return name;
	}

}
