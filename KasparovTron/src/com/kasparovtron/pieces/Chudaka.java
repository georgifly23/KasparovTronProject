package com.kasparovtron.pieces;

public class Chudaka extends Piece implements CanBlast {

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

	private boolean checkAttack(int moveRow, int moveCol) {
		if (checkBounds(moveRow, moveCol)) {
			int moveRowCoeficient = (this.row - moveRow);
			int moveColCoeficient = (this.col - moveCol);

			if (Math.abs(moveRowCoeficient) == 2) {
				// ако абсолютната стоитнос на rowCoef е 2 ще провери дали colCoef е 1
				if (Math.abs(moveColCoeficient) == 1) {
					// тоест се движим по ред
					return true;
				}
			}
			if (Math.abs(moveRowCoeficient) == 2 && moveCol == this.col) {
				return true;
			}

		}
		return false;
	}

	public void attack(int attackRow, int attackCol) {
		// to do attack restrictions
		if (checkAttack(attackRow, attackCol)) {
			blast(attackRow, attackCol);
		}
	}

	@Override
	public String getName() {
		String name = "Chudaka";
		return name;
	}

	@Override
	public void blast(int row, int col) {

	}



}
