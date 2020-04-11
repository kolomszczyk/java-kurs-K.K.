package Piece;

public abstract class Piece {
	// miejsce na którym jest figura
	private short horizontal;
	private	short vertical;
	
	
	
	public Piece(short horizontal, short vertical){
		this.horizontal = horizontal;
		this.vertical = vertical;
	};
	
	public void move(int horizontal, int vertical) {};
	
	public short getHorizontal() {
		return this.horizontal;
	}
	public short getVertical() {
		return this.vertical;
	}
}
