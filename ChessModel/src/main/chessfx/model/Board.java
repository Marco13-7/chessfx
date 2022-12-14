package main.chessfx.model;

import java.util.ArrayList;

public class Board {
	
	private ArrayList<Square> squares;
	private char[] regularRows = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
	
	public Board() {
		squares = new ArrayList<>();
	}
	
	private void initializeRegularBoard() {
		for (char row: regularRows) {
			for (int i = 1; i <=8; i++) {
				squares.add(new Square(row, i));
			}
		}		
	}

}
