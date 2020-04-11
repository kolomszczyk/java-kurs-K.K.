package Piece;

// pion

public class Pawn extends Piece{

	public static final short WHITEMOVE = 1;
	public static final short BLACKMOVE = -1;
	short pawnMove;
	
	public Pawn(short horizontal, short vertical, short whiteOrBlack) {
		super(horizontal, vertical);
		pawnMove = whiteOrBlack;
	}
	
	
}
