package com.kasparovtron.pieces;

public class Knight extends Piece {

	public Knight(String inputColor, int row, int col) {
		super(inputColor, row, col);

		this.power = 5;
		this.id = 4;

	}

	public boolean isMovePossible(int moveRow, int moveCol) {

		if (checkBounds(moveRow, moveCol)) {

			int rowCoef = this.row - moveRow;
			int colCoef = this.col - moveCol;

			if (Math.abs(rowCoef) == 2) {
				// ако абсолютната стоитнос на rowCoef е 2 ще провери дали colCoef е 1
				if (Math.abs(colCoef) == 1) {
					// тоест се движим по ред
					return true;
				}
			}
			if (Math.abs(colCoef) == 2) {
				// ако абсолютната стоитнос на colCoef е 2 ще провери дали rowCoef е 1
				if (Math.abs(rowCoef) == 1) {
					// тоест се движим по колона
					return true;
				}
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
		String name = "Knight";
		return name;
	}
}
