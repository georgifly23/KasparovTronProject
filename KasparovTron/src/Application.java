import java.util.Scanner;

import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.*;
import com.kasparovtron.tests.*;

public class Application {
	static boolean whoTurnIs = true;
	static Piece[] whitePieces;
	static Piece[] blackPieces;

	public static void createPiece() {
		whitePieces = new Piece[20];
		blackPieces = new Piece[20];

		int nextHalfIndicator = 0;

		for (int i = 0; i < (whitePieces.length / 2) - 1; i++) {
			if (i < 8) {
				whitePieces[i] = new Pawn(PieceColor.WHITE, 8, i);
				blackPieces[i] = new Pawn(PieceColor.BLACK, 1, i);
			} else {
				whitePieces[i] = new Chudaka(PieceColor.WHITE, 9, i);
				blackPieces[i] = new Chudaka(PieceColor.BLACK, 0, i);
				nextHalfIndicator = i + 1;
			}
		}
		for (int i = 0; i < (whitePieces.length / 2) - 2; i++) {
			if (i == 0 || i == 7) {
				whitePieces[i + nextHalfIndicator] = new Rook(PieceColor.WHITE, 9, i);
				blackPieces[i + nextHalfIndicator] = new Rook(PieceColor.BLACK, 0, i);
			}
			if (i == 1 || i == 6) {
				whitePieces[i + nextHalfIndicator] = new Knight(PieceColor.WHITE, 9, i);
				blackPieces[i + nextHalfIndicator] = new Knight(PieceColor.BLACK, 0, i);
			}
			if (i == 2 || i == 5) {
				whitePieces[i + nextHalfIndicator] = new Bishop(PieceColor.WHITE, 9, i);
				blackPieces[i + nextHalfIndicator] = new Bishop(PieceColor.BLACK, 0, i);
			}
			if (i == 3) {
				whitePieces[i + nextHalfIndicator] = new Queen(PieceColor.WHITE, 9, i);
				blackPieces[i + nextHalfIndicator] = new Queen(PieceColor.BLACK, 0, i);
			}
			if (i == 4) {
				whitePieces[i + nextHalfIndicator] = new King(PieceColor.WHITE, 9, i);
				blackPieces[i + nextHalfIndicator] = new King(PieceColor.BLACK, 0, i);
			}
		}

	}

	public static void turn() {

		// 1. Arrange
		while (true) {
			Scanner Movement = new Scanner(System.in);
			if (whoTurnIs) {
				System.out.println("White Turn");
				for (int i = 0; i < (whitePieces.length) - 3; i++) {
					System.out.print(i + " " + whitePieces[i].getName() + " " + whitePieces[i].getPosition()[0] + ":");
					System.out.println(whitePieces[i].getPosition()[1]);

				}
			} else {
				System.out.println("Black Turn");
				for (int i = 0; i < (blackPieces.length) - 3; i++) {
					System.out.print(i + " " + blackPieces[i].getName() + " " + blackPieces[i].getPosition()[0] + ":");
					System.out.println(blackPieces[i].getPosition()[1]);
				}
			}
			System.out.println("Choose which piece to move:");
			int pieceNumber = Movement.nextInt();
			System.out.println("Desired Row:");
			int currentRow = Movement.nextInt();
			System.out.println("Desired Col:");
			int currentCol = Movement.nextInt();

			if (whoTurnIs) {
				whitePieces[pieceNumber].move(currentRow, currentCol);
				System.out.print("You moved " + whitePieces[pieceNumber].getName() + " to : "
						+ whitePieces[pieceNumber].getPosition()[0] + ":");
				System.out.println(whitePieces[pieceNumber].getPosition()[1]);
			} else {
				blackPieces[pieceNumber].move(currentRow, currentCol);
				System.out.print("You moved " + blackPieces[pieceNumber].getName() + " to : "
						+ blackPieces[pieceNumber].getPosition()[0] + ":");
				System.out.println(blackPieces[pieceNumber].getPosition()[1]);
			}
			whoTurnIs = !whoTurnIs;
		}

	}

	public static void main(String[] args) {

		// How to restrict the input parameter.
		// I need only two specific color strings.
		// Pawn p1 = new Pawn (PieceColor.BLACK , 1 , 0);

		// PawnTest.run();
		// RookTest.run();
		// BishopTest.run();
		// KnightTest.run();
		// KingTest.run();
		// QueenTest.run();
		// ChudakaTest.run();
		createPiece();
		turn();

		/*
		 * Pawn p = new Pawn(PieceColor.BLACK, 1 ,0); if (p instanceof Pawn) {
		 * System.out.println("Yes"); } if (p instanceof Piece) {
		 * System.out.println("Yes"); } if (p instanceof Object) {
		 * System.out.println("Yes"); }
		 */

		// System.out.println(p.color);
		// System.out.println(p.power);
		// System.out.println(p.id);
	}

}
