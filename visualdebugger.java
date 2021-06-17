package tests;

import ss.utils.TextIO;
import startclass.Board;
import startclass.Game;
import startclass.cell;

public class visualdebugger {
	

	public static void main(String[] args) {
		
		Board board = new Board();
		while(true) {

			board.setUpBoard(5);
			System.out.println(board.boardToStringTeams());
			System.out.println(board.toString());
			System.out.println("Row, Index, HowMany, Where to select, Where to move.  without spaces");
			int input;
			int row;
			int ind;
			int howMany;
			int whereS;
			int whereM;
			input = TextIO.getInt();
			row = (input - (input%10000))/10000;
			input = input - row*10000;
			ind = (input - (input%1000))/1000;
			input = input - ind*1000;
			howMany = (input - (input%100))/100;
			input = input - howMany*100;
			whereS = (input - (input%10))/10;
			input = input - whereS*10;
			whereM = input;
			board.moveBalls(row, ind, howMany, whereS, whereM);
			System.out.println("row: " +row+"index: " +ind+"howMany : " +howMany+"Where select : " +whereS+"Where to move: " +whereM);
			board.evenOutBoards();
			System.out.println(board.boardToStringTeams());
			System.out.println(board.toString());
		
		}
		
	}

}
