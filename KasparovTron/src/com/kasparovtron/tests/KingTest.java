package com.kasparovtron.tests;

import java.util.Scanner;

import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.Bishop;
import com.kasparovtron.pieces.King;

public class KingTest {

	public static void testIfTheMoveMethodPositionThePieceCorrectly() {

		// 1. Arrange
		Scanner Movement = new Scanner(System.in);
		System.out.println("Enter currentRow:");
		int currentRow = Movement.nextInt();
		System.out.println("Enter currentCol:");
		int currentCol = Movement.nextInt();

		King testKing = new King(PieceColor.BLACK, currentRow, currentCol);

		// 2. Act
		System.out.println("Enter desireRow:");
		int desireRow = Movement.nextInt();
		System.out.println("Enter desireCol:");
		int desireCol = Movement.nextInt();

		boolean isValid = testKing.isMovePossible(desireRow, desireCol);

		// 3. Assert
		String testMessage = (isValid) ? "It's possible to move the King at this case."
				: "It's impossible to move the King at this case.";
		System.out.println(testMessage);

	}

	/*
	 * public static void testIfMoveOverTwoSquereIsNotPossible() {
	 * 
	 * // 1. Arrange King testKing = new King(PieceColor.BLACK, 9, 0);
	 * 
	 * // 2. Act boolean isValid = testKing.isMovePossible(7, 1) == false;
	 * 
	 * // 3. Assert String testMessage = (isValid) ?
	 * "It's impossible to move the King at this case." :
	 * "It's possible to move the King at this case.";
	 * System.out.println(testMessage);
	 * 
	 * }
	 */

	public static void run() {

		testIfTheMoveMethodPositionThePieceCorrectly();
		// testIfMoveOverTwoSquereIsNotPossible();

	}

}
