package com.kasparovtron.pieces;

public class Chudaka extends Piece {

	public Chudaka(String inputColor, int row, int col) {
		super(inputColor, row, col);

		this.power = 15;
		this.id = 7;
	}

	public boolean isMovePossible(int moveRow, int moveCol) {

		if (!checkBounds(moveRow, moveCol)) {
			return false;
		}

		int moveRowCoeficient = (this.row - moveRow);
		int moveColCoeficient = (this.col - moveCol);

		boolean isRowMovementPossible = (moveRowCoeficient == 1);
		boolean isColMovementPossible = (moveColCoeficient == 0);

		return isRowMovementPossible && isColMovementPossible;
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
		// to do attack restrictions
	}

	@Override
	public String getName() {
		String name = "Chudaka";
		return name;
	}

}
