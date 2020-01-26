package com.kasparovtron.tests;

import java.util.Scanner;

import com.kasparovtron.config.PieceColor;

import com.kasparovtron.pieces.Queen;

public class QueenTest {

	public static void testIfTheMoveMethodPositionThePieceCorrectly() {

		// 1. Arrange
		Scanner Movement = new Scanner(System.in);
		System.out.println("Enter currentRow:");
		int currentRow = Movement.nextInt();
		System.out.println("Enter currentCol:");
		int currentCol = Movement.nextInt();

		Queen testQueen = new Queen(PieceColor.BLACK, currentRow, currentCol);

		// 2. Act
		System.out.println("Enter desireRow:");
		int desireRow = Movement.nextInt();
		System.out.println("Enter desireCol:");
		int desireCol = Movement.nextInt();

		boolean isValid = testQueen.isMovePossible(desireRow, desireCol);

		// 3. Assert
		String testMessage = (isValid) ? "It's possible to move the Queen at this case."
				: "It's impossible to move the Queen at this case.";
		System.out.println(testMessage);

	}

	/*
	 * public static void testIfMoveOverTwoSquereIsNotPossible() {
	 * 
	 * // 1. Arrange Queen testQueen = new Queen(PieceColor.BLACK, 8, 0);
	 * 
	 * // 2. Act boolean isValid = testQueen.isMovePossible(5, 1) == false;
	 * 
	 * // 3. Assert String testMessage = (isValid) ?
	 * "It's impossible to move the Queen at this case." :
	 * "It's possible to move the Queen at this case.";
	 * System.out.println(testMessage);
	 * 
	 * }
	 */
	public static void run() {

		testIfTheMoveMethodPositionThePieceCorrectly();
		// testIfMoveOverTwoSquereIsNotPossible();

	}

}
