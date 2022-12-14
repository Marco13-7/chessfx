package main.chessfx.model;

public class Square {
	
	private char file;
	private int rank;
	
	public Square(char row, int column) {
		super();
		this.file = row;
		this.rank = column;
	}	
	
	@Override
	public String toString() {
		return "File: "+ file + " | Rank: "+ rank;
	}

}
