package com.kasparovtron.tests;

import java.util.Scanner;

import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.Bishop;
import com.kasparovtron.pieces.Chudaka;

public class BishopTest {

	public static void testIfTheMoveMethodPositionThePieceCorrectly() {

		// 1. Arrange
		Scanner Movement = new Scanner(System.in);
		System.out.println("Enter currentRow:");
		int currentRow = Movement.nextInt();
		System.out.println("Enter currentCol:");
		int currentCol = Movement.nextInt();

		Bishop testBishop = new Bishop(PieceColor.BLACK, currentRow, currentCol);

		// 2. Act
		System.out.println("Enter desireRow:");
		int desireRow = Movement.nextInt();
		System.out.println("Enter desireCol:");
		int desireCol = Movement.nextInt();

		boolean isValid = testBishop.isMovePossible(desireRow, desireCol);

		// 3. Assert
		String testMessage = (isValid) ? "It's possible to move the Bishop at this case."
				: "It's impossible to move the Bishop at this case.";
		System.out.println(testMessage);
	}

	/*
	 * public static void testIfMoveOverTwoSquereIsNotPossible() {
	 * 
	 * // 1. Arrange Bishop testBishop = new Bishop(PieceColor.BLACK, 8, 0);
	 * 
	 * // 2. Act boolean isValid = testBishop.isMovePossible(5, 0) == false;
	 * 
	 * // 3. Assert String testMessage = (isValid) ?
	 * "It's impossible to move the Bishop at this case." :
	 * "It's possible to move the Bishop at this case.";
	 * System.out.println(testMessage);
	 * 
	 * }
	 */

	public static void run() {

		testIfTheMoveMethodPositionThePieceCorrectly();
		// testIfMoveOverTwoSquereIsNotPossible();

	}

}
