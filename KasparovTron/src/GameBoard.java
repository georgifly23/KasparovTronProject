import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.Piece;

public class GameBoard {

	public static Piece board[][] = new Piece[10][10];
	
	/*
	 * public static void init() {
	 * 
	 * board[1][0] = new Pawn(PieceColor.BLACK,1,0);
	 * 
	 * }
	 */

	public static void render() {
		/*Peice currentTile = null;
		for(int i = 0; i < board.length; i ++) {
			
			for(int j = 0; j < board.length; j++) {
				
				currentTile  = board[i][j];
				String tileSignature = (currentTile == null) ? 
										"* " : 
										currentTile.getStignature() + " ";
				
				System.out.print(tileSignature);
			}
			System.out.println();
		}
			}*/
		}
	}

