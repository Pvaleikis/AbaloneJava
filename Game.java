package startclass;

import ss.utils.TextIO;

public class Game {
	private Board board;
	private int utilityint;
	
	public Game() {
		this.board = new Board();
	}
	
	public void play2() {
		board.setUpBoard(2);
		String checkBoard = this.board.toString();
		int input;
		int row;
		int ind;
		int howMany;
		int whereS;
		int whereM;
		cell player1;
		cell player2; 
		if(Math.random() >= 0.5) {
			System.out.println("Y start the game");
			player1 = cell.Y;
			player2 = cell.X;
		} else {
			System.out.println("X start the game");
			player1 = cell.X;
			player2 = cell.Y;
		}
		System.out.println(board.boardToStringTeams());
		
		boolean firstTurn=true;
		while(true) {
			
			
			while(firstTurn) {
				System.out.println("Row, Index, HowMany, Where to select, Where to move.  without spaces, it is turn of" + player1.toString());
				checkBoard = this.board.boardToStringTeams();
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
				
				if(this.board.getField(row, ind).getCell() == player1) {
					System.out.println("row: " +row+"index: " +ind+"howMany : " +howMany+"Where select : " +whereS+"Where to move: " +whereM);
					try {
						board.fullMove(row, ind, howMany, whereS, whereM);
					} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Can't push your balls out of the board");
					}
					//System.out.println(board.toString());
					//board.evenOutBoards();
					System.out.println(board.boardToStringTeams());
					System.out.println( player2.toString() + "pushed off " + board.getScore(player2));
					
					
				} 
				
				if(this.board.toString().equals(checkBoard)) {
					System.out.println("Invalid move, try again");
				} else {
					firstTurn = false;
				}
				
			}
			
			if(this.isWinner2()) {
				System.out.println(player1.toString() +" is the winner");
				break;	
			}
			
			while(!firstTurn) {
				System.out.println("Row, Index, HowMany, Where to select, Where to move.  without spaces, it is turn of" + player2.toString());
				checkBoard = this.board.boardToStringTeams();
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
				
				if(this.board.getField(row, ind).getCell() == player2) {
					System.out.println("row: " +row+"index: " +ind+"howMany : " +howMany+"Where select : " +whereS+"Where to move: " +whereM);
					try {
						board.fullMove(row, ind, howMany, whereS, whereM);
					} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Can't push your balls out of the board");
					}
					
					//System.out.println(board.toString());
					//board.evenOutBoards();
					System.out.println(board.boardToStringTeams());
					System.out.println( player1.toString() + "pushed off " + board.getScore(player1));
				} 
				if(this.board.toString().equals(checkBoard) ) {
					System.out.println("Invalid move, try again");
				} else {
					firstTurn = true;
				}
				
			}
			
			if(this.isWinner2()) {
				System.out.println(player2.toString() +" is the winner");
				break;	
			}
		}
	
	}
	
	public boolean isWinner2(){
		boolean rt=false;
		if(this.board.getScore(cell.X)>=2 || this.board.getScore(cell.Y)>=2) {
			rt = true;
		}
		return rt;
	}
	
	public boolean isWinner3(cell player) {
		boolean rt=false;
		switch(player) {
			case X:
				if(this.board.getScore(cell.T)>=6 && this.board.getScore(cell.Y)>=6) {
					rt = true;
				}
				break;
			case Y:
				if(this.board.getScore(cell.T)>=6 && this.board.getScore(cell.X)>=6) {
					rt = true;
				}
				break;
			case T:
				if(this.board.getScore(cell.Y)>=6 && this.board.getScore(cell.X)>=6) {
					rt = true;
				}
				break;
			default:
				rt =false;
				break;
		}
		if(this.board.getScore(cell.X)>=6 || this.board.getScore(cell.Y)>=6) {
			rt = true;
		}
		return rt;
	}
	
	
	public void play3() {
		boolean turn;
		board.setUpBoard(3);
		String checkBoard = this.board.toString();
		int input;
		int row;
		int ind;
		int howMany;
		int whereS;
		int whereM;
		cell player1;
		cell player2; 
		cell player3;
		//The players don't have an equal chance to be the first, but practically it doesn't matter
		if(Math.random() <= 0.3) {
			System.out.println("Y start the game");
			player1 = cell.Y;
			player2 = cell.X;
			player3 = cell.T;
		} else if (Math.random() <= 0.6) {
			System.out.println("X start the game");
			player1 = cell.X;
			player2 = cell.Y;
			player3 = cell.T;
			
		} else {
			System.out.println("Y start the game");
			player1 = cell.T;
			player2 = cell.Y;
			player3 = cell.X;
		}
		System.out.println(board.boardToStringTeams());
		//first turn----------------------------------------------------------------------------------------------------------------------
		while(true) {
			turn = true;
			while(turn && this.board.getScore(player1)<6) {
				System.out.println("Row, Index, HowMany, Where to select, Where to move.  without spaces, it is turn of" + player1.toString());
				checkBoard = this.board.boardToStringTeams();
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
				
				if(this.board.getField(row, ind).getCell() == player1) {
					System.out.println("row: " +row+"index: " +ind+"howMany : " +howMany+"Where select : " +whereS+"Where to move: " +whereM);
					try {
						board.fullMove(row, ind, howMany, whereS, whereM);
					} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Can't push your balls out of the board");
					}
					//System.out.println(board.toString());
					//board.evenOutBoards();
					System.out.println(board.boardToStringTeams());
					System.out.println( player1.toString() + " off the board " + board.getScore(player1));
					System.out.println( player2.toString() + " off the board " + board.getScore(player2));
					System.out.println( player3.toString() + " off the board " + board.getScore(player3));
					
					
				} 
				
				if(this.board.toString().equals(checkBoard)) {
					System.out.println("Invalid move, try again");
				} else {
					turn = false;
				}
			}
			if(isWinner3(player1)) {
				System.out.println(player1.toString() +" is the winner");
				break;
			}
			
			// second turn----------------------------------------------------------------------------------------------------------------------
			turn = true;
			while(turn && this.board.getScore(player2)<6) {
				System.out.println("Row, Index, HowMany, Where to select, Where to move.  without spaces, it is turn of" + player2.toString());
				checkBoard = this.board.boardToStringTeams();
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
				
				if(this.board.getField(row, ind).getCell() == player2) {
					System.out.println("row: " +row+"index: " +ind+"howMany : " +howMany+"Where select : " +whereS+"Where to move: " +whereM);
					try {
						board.fullMove(row, ind, howMany, whereS, whereM);
					} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Can't push your balls out of the board");
					}
					//System.out.println(board.toString());
					//board.evenOutBoards();
					System.out.println(board.boardToStringTeams());
					System.out.println( player1.toString() + " off the board " + board.getScore(player1));
					System.out.println( player2.toString() + " off the board " + board.getScore(player2));
					System.out.println( player3.toString() + " off the board " + board.getScore(player3));
					
					
				} 
				
				if(this.board.toString().equals(checkBoard)) {
					System.out.println("Invalid move, try again");
				} else {
					turn = false;
				}
			}
			if(isWinner3(player2)) {
				System.out.println(player2.toString() +" is the winner");
				break;
			}
			//third turn----------------------------------------------------------------------------------------------------------------------
			turn = true;
			while(turn && this.board.getScore(player3)<6) {
				System.out.println("Row, Index, HowMany, Where to select, Where to move.  without spaces, it is turn of" + player3.toString());
				checkBoard = this.board.boardToStringTeams();
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
				
				if(this.board.getField(row, ind).getCell() == player3) {
					System.out.println("row: " +row+"index: " +ind+"howMany : " +howMany+"Where select : " +whereS+"Where to move: " +whereM);
					try {
						board.fullMove(row, ind, howMany, whereS, whereM);
					} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Can't push your balls out of the board");
					}
					//System.out.println(board.toString());
					//board.evenOutBoards();
					System.out.println(board.boardToStringTeams());
					System.out.println( player1.toString() + " off the board " + board.getScore(player1));
					System.out.println( player2.toString() + " off the board " + board.getScore(player2));
					System.out.println( player3.toString() + " off the board " + board.getScore(player3));
					
					
				} 
				
				if(this.board.toString().equals(checkBoard)) {
					System.out.println("Invalid move, try again");
				} else {
					turn = false;
				}
			}
			if(isWinner3(player3)) {
				System.out.println(player3.toString() +" is the winner");
				break;
			}
		}
		
	}
	
	public void play4() {
		boolean turn;
		this.board.setUpBoard(4);
		String checkBoard = this.board.toString();
		int input;
		int row;
		int ind;
		int howMany;
		int whereS;
		int whereM;
		cell player1;
		cell player2; 
		cell player3;
		cell player4;
		
		System.out.println(this.board.toString());
		
		if(Math.random() >= 0.5) {
			if(Math.random() >= 0.5) {
				System.out.println("Y start the game");
				player1 = cell.Y;
				player2 = cell.X;
				player3 = cell.L;
				player4 = cell.K;
			} else {
				System.out.println("X start the game");
				player1 = cell.X;
				player2 = cell.Y;
				player3 = cell.K;
				player4 = cell.L;
			}
		} else {
			if(Math.random() >= 0.5) {
				System.out.println("L start the game");
				player1 = cell.L;
				player2 = cell.K;
				player3 = cell.Y;
				player4 = cell.X;
			} else {
				System.out.println("K start the game");
				player1 = cell.K;
				player2 = cell.L;
				player3 = cell.X;
				player4 = cell.Y;
			}
		}
		while(true) {
			turn = true;
			while(turn) {
				System.out.println("Row, Index, HowMany, Where to select, Where to move.  without spaces, it is turn of" + player1.toString());
				checkBoard = this.board.toString();
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
				
				if(this.board.getField(row, ind).getApp() == player1) {
					System.out.println("row: " +row+"index: " +ind+"howMany : " +howMany+"Where select : " +whereS+"Where to move: " +whereM);
					try {
						board.fullMove(row, ind, howMany, whereS, whereM);
					} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Can't push your balls out of the board");
					}
					
					board.evenOutBoards();
					System.out.println(board.toString());
					utilityint=board.getScore(player2) + board.getScore(player4);
					System.out.println( player2.toString()+ "and"+ player4.toString() + "lost this amoutn of balls " + utilityint);
					
					
				} 
				
				if(this.board.toString().equals(checkBoard)) {
					System.out.println("Invalid move, try again");
				} else {
					turn = false;
				}
				
			}
			if(this.isWinner2()) {
				System.out.println(player1.toString() + " and " + player3.toString( ) + " are the winners");
				break;	
			}
			turn = true;
			//player 2 turn -------------------------------------------------------------------------------------------------------------
			while(turn) {
				System.out.println("Row, Index, HowMany, Where to select, Where to move.  without spaces, it is turn of" + player2.toString());
				checkBoard = this.board.toString();
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
				
				if(this.board.getField(row, ind).getApp() == player2) {
					System.out.println("row: " +row+"index: " +ind+"howMany : " +howMany+"Where select : " +whereS+"Where to move: " +whereM);
					try {
						board.fullMove(row, ind, howMany, whereS, whereM);
					} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Can't push your balls out of the board");
					}
					board.evenOutBoards();
					System.out.println(board.toString());
					utilityint=board.getScore(player1) + board.getScore(player3);
					System.out.println( player1.toString()+ "and"+ player3.toString() + "lost this amoutn of balls " + utilityint);
					
				} 
				
				if(this.board.toString().equals(checkBoard)) {
					System.out.println("Invalid move, try again");
				} else {
					turn = false;
				}
				
			}
			if(this.isWinner2()) {
				System.out.println(player2.toString() + " and " + player4.toString( ) + " are the winners");
				break;	
			}
			turn = true;
			//player 3 turn -------------------------------------------------------------------------------------------------------------
			while(turn) {
				System.out.println("Row, Index, HowMany, Where to select, Where to move.  without spaces, it is turn of" + player3.toString());
				checkBoard = this.board.toString();
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
				
				if(this.board.getField(row, ind).getApp() == player3) {
					System.out.println("row: " +row+"index: " +ind+"howMany : " +howMany+"Where select : " +whereS+"Where to move: " +whereM);
					try {
						board.fullMove(row, ind, howMany, whereS, whereM);
					} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Can't push your balls out of the board");
					}
					board.evenOutBoards();
					System.out.println(board.toString());
					utilityint =board.getScore(player2) + board.getScore(player4);
					System.out.println( player2.toString()+ "and"+ player4.toString() + "lost this amoutn of balls " + utilityint);
					
				} 
				
				if(this.board.toString().equals(checkBoard)) {
					System.out.println("Invalid move, try again");
				} else {
					turn = false;
				}
				
			}
			if(this.isWinner2()) {
				System.out.println(player1.toString() + " and " + player3.toString( ) + " are the winners");
				break;	
			}
			turn = true;
			//player 4 turn -------------------------------------------------------------------------------------------------------------
			while(turn) {
				System.out.println("Row, Index, HowMany, Where to select, Where to move.  without spaces, it is turn of" + player4.toString());
				checkBoard = this.board.toString();
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
				
				if(this.board.getField(row, ind).getApp() == player4) {
					System.out.println("row: " +row+"index: " +ind+"howMany : " +howMany+"Where select : " +whereS+"Where to move: " +whereM);
					try {
						board.fullMove(row, ind, howMany, whereS, whereM);
					} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Can't push your balls out of the board");
					}
					board.evenOutBoards();
					System.out.println(board.toString());
					utilityint = board.getScore(player1) + board.getScore(player3);
					System.out.println( player1.toString()+ "and"+ player3.toString() + "lost this amoutn of balls " + utilityint);
					
				} 
				
				if(this.board.toString().equals(checkBoard)) {
					System.out.println("Invalid move, try again");
				} else {
					turn = false;
				}
				
			}
			if(this.isWinner2()) {
				System.out.println(player2.toString() + " and " + player4.toString( ) + " are the winners");
				break;	
			}
		}
	}
	
}
