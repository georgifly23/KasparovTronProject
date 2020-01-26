package com.kasparovtron.pieces;

public abstract class Piece {

	public String color;
	public int power;
	public int id;
	public int row;
	public int col;

	public Piece(String inputColor, int row, int col) {
		this.color = inputColor;
		this.row = row;
		this.col = col;

	}

	public int[] getPosition() {
		int[] position = new int[2];
		position[0] = this.row;
		position[1] = this.col;
		return position;
	}

	public abstract String getName();

	public abstract void move(int moveRow, int moveCol);

	public abstract void attack(int attackRow, int attackCol);

}
