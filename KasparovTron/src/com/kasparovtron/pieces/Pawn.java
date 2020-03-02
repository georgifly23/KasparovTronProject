package com.kasparovtron.pieces;

public class Pawn extends Piece {

	public Pawn(String inputColor, int row, int col) {
		super(inputColor, row, col);

		this.power = 1;
		this.id = 1;

	}

	public boolean isMovePossible(int moveRow, int moveCol) {

		if (!checkBounds(moveRow, moveCol)) {
			return false;
		}

		int moveRowCoeficient = (this.row - moveRow);
		int moveColCoeficient = (this.col - moveCol);

		boolean isRowMovementPossible = (Math.abs(moveRowCoeficient) == 1);
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
	private boolean checkAttack(int moveRow , int moveCol) {
	if(checkBounds(moveRow, moveCol)) {
		int moveRowCoeficient = (this.row - moveRow);
		int moveColCoeficient = (this.col - moveCol);
		
		boolean isRowMovementPossible = (Math.abs(moveRowCoeficient) == 1);
		boolean isColMovementPossible = (Math.abs(moveColCoeficient) == 1);
		
		return isRowMovementPossible && isColMovementPossible;
		
	}
	return false;
	}
	public void attack(int attackRow, int attackCol) {
		// to do attack restrictions
		if (checkAttack(attackRow, attackCol)) {
			this.row = attackRow;
			this.col = attackCol;
		}
	}

	@Override
	public String getName() {
		String name = "Pawn";
		return name;
	}



}
