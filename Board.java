package startclass;


public class Board {
	public static final Ball[][] TESTBOARD = {{new Ball(cell.O, 0, 0), new Ball(cell.O, 0, 1), new Ball(cell.O, 0, 2), new Ball(cell.O, 0, 3), new Ball(cell.O, 0, 4)},
			{new Ball(cell.O, 1, 0), new Ball(cell.X, 1, 1), new Ball(cell.X, 1, 2), new Ball(cell.X, 1, 3), new Ball(cell.O, 1, 4), new Ball(cell.O, 1, 5)}, 
			{new Ball(cell.O, 2, 0), new Ball(cell.O, 2, 1), new Ball(cell.X, 2, 2), new Ball(cell.X, 2, 3), new Ball(cell.X, 2, 4), new Ball(cell.Y, 2, 5), new Ball(cell.Y, 2, 6)},
			{new Ball(cell.O, 3, 0), new Ball(cell.O, 3, 1), new Ball(cell.O, 3, 2), new Ball(cell.O, 3, 3), new Ball(cell.O, 3, 4), new Ball(cell.O, 3, 5), new Ball(cell.O, 3, 6), new Ball(cell.O, 3, 7)},
			{new Ball(cell.O, 4, 0), new Ball(cell.L, 4, 1), new Ball(cell.L, 4, 2), new Ball(cell.O, 4, 3), new Ball(cell.O, 4, 4), new Ball(cell.O, 4, 5), new Ball(cell.O, 4, 6), new Ball(cell.O, 4, 7), new Ball(cell.O, 4, 8)},
			{new Ball(cell.O, 5, 0), new Ball(cell.L, 5, 1), new Ball(cell.L, 5, 2), new Ball(cell.O, 5, 3), new Ball(cell.O, 5, 4), new Ball(cell.O, 5, 5), new Ball(cell.O, 5, 6), new Ball(cell.O, 5, 7)},
			{new Ball(cell.O, 6, 0), new Ball(cell.Y, 6, 1), new Ball(cell.O, 6, 2), new Ball(cell.X, 6, 3), new Ball(cell.K, 6, 4), new Ball(cell.O, 6, 5), new Ball(cell.O, 6, 6)},
			{new Ball(cell.O, 7, 0), new Ball(cell.O, 7, 1), new Ball(cell.O, 7, 2), new Ball(cell.K, 7, 3), new Ball(cell.K, 7, 4), new Ball(cell.O, 7, 5)},
			{new Ball(cell.O, 8, 0), new Ball(cell.O, 8, 1), new Ball(cell.O, 8, 2), new Ball(cell.O, 8, 3), new Ball(cell.K, 8, 4)}};
	public static final Ball[][] BOARD2PLAYER = {{new Ball(cell.X, 0, 0), new Ball(cell.X, 0, 1), new Ball(cell.X, 0, 2), new Ball(cell.X, 0, 3), new Ball(cell.X, 0, 4)},
			{new Ball(cell.X, 1, 0), new Ball(cell.X, 1, 1), new Ball(cell.X, 1, 2), new Ball(cell.X, 1, 3), new Ball(cell.X, 1, 4), new Ball(cell.X, 1, 5)}, 
			{new Ball(cell.O, 2, 0), new Ball(cell.O, 2, 1), new Ball(cell.X, 2, 2), new Ball(cell.X, 2, 3), new Ball(cell.X, 2, 4), new Ball(cell.O, 2, 5), new Ball(cell.O, 2, 6)},
			{new Ball(cell.O, 3, 0), new Ball(cell.O, 3, 1), new Ball(cell.O, 3, 2), new Ball(cell.O, 3, 3), new Ball(cell.O, 3, 4), new Ball(cell.O, 3, 5), new Ball(cell.O, 3, 6), new Ball(cell.O, 3, 7)},
			{new Ball(cell.O, 4, 0), new Ball(cell.O, 4, 1), new Ball(cell.O, 4, 2), new Ball(cell.O, 4, 3), new Ball(cell.O, 4, 4), new Ball(cell.O, 4, 5), new Ball(cell.O, 4, 6), new Ball(cell.O, 4, 7), new Ball(cell.O, 4, 8)},
			{new Ball(cell.O, 5, 0), new Ball(cell.O, 5, 1), new Ball(cell.O, 5, 2), new Ball(cell.O, 5, 3), new Ball(cell.O, 5, 4), new Ball(cell.O, 5, 5), new Ball(cell.O, 5, 6), new Ball(cell.O, 5, 7)},
			{new Ball(cell.O, 6, 0), new Ball(cell.O, 6, 1), new Ball(cell.Y, 6, 2), new Ball(cell.Y, 6, 3), new Ball(cell.Y, 6, 4), new Ball(cell.O, 6, 5), new Ball(cell.O, 6, 6)},
			{new Ball(cell.Y, 7, 0), new Ball(cell.Y, 7, 1), new Ball(cell.Y, 7, 2), new Ball(cell.Y, 7, 3), new Ball(cell.Y, 7, 4), new Ball(cell.Y, 7, 5)},
			{new Ball(cell.Y, 8, 0), new Ball(cell.Y, 8, 1), new Ball(cell.Y, 8, 2), new Ball(cell.Y, 8, 3), new Ball(cell.Y, 8, 4)}};
	public static final Ball[][] BOARD3PLAYER = {{new Ball(cell.X, 0, 0), new Ball(cell.X, 0, 1), new Ball(cell.O, 0, 2), new Ball(cell.T, 0, 3), new Ball(cell.T, 0, 4)},
			{new Ball(cell.X, 1, 0), new Ball(cell.X, 1, 1), new Ball(cell.O, 1, 2), new Ball(cell.O, 1, 3), new Ball(cell.T, 1, 4), new Ball(cell.T, 1, 5)}, 
			{new Ball(cell.X, 2, 0), new Ball(cell.X, 2, 1), new Ball(cell.O, 2, 2), new Ball(cell.O, 2, 3), new Ball(cell.O, 2, 4), new Ball(cell.T, 2, 5), new Ball(cell.T, 2, 6)},
			{new Ball(cell.X, 3, 0), new Ball(cell.X, 3, 1), new Ball(cell.O, 3, 2), new Ball(cell.O, 3, 3), new Ball(cell.O, 3, 4), new Ball(cell.O, 3, 5), new Ball(cell.T, 3, 6), new Ball(cell.T, 3, 7)},
			{new Ball(cell.X, 4, 0), new Ball(cell.X, 4, 1), new Ball(cell.O, 4, 2), new Ball(cell.O, 4, 3), new Ball(cell.O, 4, 4), new Ball(cell.O, 4, 5), new Ball(cell.O, 4, 6), new Ball(cell.T, 4, 7), new Ball(cell.T, 4, 8)},
			{new Ball(cell.X, 5, 0), new Ball(cell.O, 5, 1), new Ball(cell.O, 5, 2), new Ball(cell.O, 5, 3), new Ball(cell.O, 5, 4), new Ball(cell.O, 5, 5), new Ball(cell.O, 5, 6), new Ball(cell.T, 5, 7)},
			{new Ball(cell.O, 6, 0), new Ball(cell.O, 6, 1), new Ball(cell.O, 6, 2), new Ball(cell.O, 6, 3), new Ball(cell.O, 6, 4), new Ball(cell.O, 6, 5), new Ball(cell.O, 6, 6)},
			{new Ball(cell.Y, 7, 0), new Ball(cell.Y, 7, 1), new Ball(cell.Y, 7, 2), new Ball(cell.Y, 7, 3), new Ball(cell.Y, 7, 4), new Ball(cell.Y, 7, 5)},
			{new Ball(cell.Y, 8, 0), new Ball(cell.Y, 8, 1), new Ball(cell.Y, 8, 2), new Ball(cell.Y, 8, 3), new Ball(cell.Y, 8, 4)}};
	public static final Ball[][] BOARD4PLAYER = {{new Ball(cell.X, 0, 0), new Ball(cell.X, 0, 1), new Ball(cell.X, 0, 2), new Ball(cell.X, 0, 3), new Ball(cell.O, 0, 4)},
			{new Ball(cell.O, 1, 0), new Ball(cell.X, 1, 1), new Ball(cell.X, 1, 2), new Ball(cell.X, 1, 3), new Ball(cell.O, 1, 4), new Ball(cell.Y, 1, 5)}, 
			{new Ball(cell.O, 2, 0), new Ball(cell.O, 2, 1), new Ball(cell.X, 2, 2), new Ball(cell.X, 2, 3), new Ball(cell.O, 2, 4), new Ball(cell.Y, 2, 5), new Ball(cell.Y, 2, 6)},
			{new Ball(cell.O, 3, 0), new Ball(cell.O, 3, 1), new Ball(cell.O, 3, 2), new Ball(cell.O, 3, 3), new Ball(cell.O, 3, 4), new Ball(cell.Y, 3, 5), new Ball(cell.Y, 3, 6), new Ball(cell.Y, 3, 7)},
			{new Ball(cell.L, 4, 0), new Ball(cell.L, 4, 1), new Ball(cell.L, 4, 2), new Ball(cell.O, 4, 3), new Ball(cell.O, 4, 4), new Ball(cell.O, 4, 5), new Ball(cell.Y, 4, 6), new Ball(cell.Y, 4, 7), new Ball(cell.Y, 4, 8)},
			{new Ball(cell.L, 5, 0), new Ball(cell.L, 5, 1), new Ball(cell.L, 5, 2), new Ball(cell.O, 5, 3), new Ball(cell.O, 5, 4), new Ball(cell.O, 5, 5), new Ball(cell.O, 5, 6), new Ball(cell.O, 5, 7)},
			{new Ball(cell.L, 6, 0), new Ball(cell.L, 6, 1), new Ball(cell.O, 6, 2), new Ball(cell.K, 6, 3), new Ball(cell.K, 6, 4), new Ball(cell.O, 6, 5), new Ball(cell.O, 6, 6)},
			{new Ball(cell.L, 7, 0), new Ball(cell.O, 7, 1), new Ball(cell.K, 7, 2), new Ball(cell.K, 7, 3), new Ball(cell.K, 7, 4), new Ball(cell.O, 7, 5)},
			{new Ball(cell.O, 8, 0), new Ball(cell.K, 8, 1), new Ball(cell.K, 8, 2), new Ball(cell.K, 8, 3), new Ball(cell.K, 8, 4)}};
	//Board is stored as an array of arrays of different lengths 
	private Ball[][] fields;
	
	private int outsideBallsY;
	private int outsideBallsX;
	private int outsideBallsK;
	private int outsideBallsL;
	private int outsideBallsT;
	
	public Board() {
		
		this.fields = TESTBOARD;
		this.outsideBallsY = 0;
		this.outsideBallsX = 0;
		this.outsideBallsL = 0;
		this.outsideBallsK = 0;
		this.outsideBallsT = 0;
	}
	
	/**@requires input >= 2 || input <=4
	 * @ensures fields == one of the static board set ups
	 */
	public void setUpBoard(int numberOfPlayers) {
		switch(numberOfPlayers) {
			case 2:
				this.fields = BOARD2PLAYER;
				break;
			case 3:
				this.fields = BOARD3PLAYER;
				break;
			case 4:
				this.fields = BOARD4PLAYER;
				break;
			default:
				this.fields = TESTBOARD;
			break;
		}
	}
	
	/**
	 * @return a visual representation of the board
	 * 
	 */
	public String toString() {
		String visual = "";
		for (int i = 0; i < 9; i++) {
			String row = "";
			String space = "";
			String present="";
			
			if(i < 5) {
				for (int j = 0; j < 8-i; j++) {
					space = space+"  ";
				}
				for (int j = 0; j < 5+i; j++) {
					present = present+j+" . ";
				}
				for(int j = 0; j < 9 -(4-i); j++) {
					
					row = row + fields[i][j].getApp().toString()+" . ";
				}
			} else {
				for (int j = 0; j < i; j++) {
					space = space+"  ";
				}
				for (int j = 0; j < 13 - i; j++) {
					present = present+j+" . ";
				}
				for(int j = 0; j < 9 - (i-4); j++) {
					row = row + fields[i][j].getApp().toString()+" . ";
				}
			}
			visual = visual + "\n" + i + "." + space + row + space + i  + "." + space + present;
			//visual = visual + "\n" + i + "." + space + row; //without the representation
		}
		return visual;
	}
	
	/**
	 *there is a bug that when using Board.toString()
	 * under certain conditions makes empty fields appear filled, 
	 * this solves that issue by making all the empty fields look empty
	 */
	public void evenOutBoards() {
		for (int i = 0; i < 9; i++) {
			
			if(i < 5) {
				for(int j = 0; j < 9 -(4-i); j++) {
					if(fields[i][j].getCell().equals(cell.O)) {
						fields[i][j].setApp(cell.O);
					}
				}
			} else {
				for(int j = 0; j < 9 - (i-4); j++) {
					if(fields[i][j].getCell().equals(cell.O)) {
						fields[i][j].setApp(cell.O);
					}
				}
			}
		}	
	}
	/**
	 * Board.toString prints out the board cosmetics of the board, this prints out how the balls will behave
	 */
	public String boardToStringTeams() {
		String visual = "";
		for (int i = 0; i < 9; i++) {
			String row = "";
			String space = "";
			String present="";
			
			if(i < 5) {
				for (int j = 0; j < 8-i; j++) {
					space = space+"  ";
				}
				for (int j = 0; j < 5+i; j++) {
					present = present+j+" . ";
				}
				for(int j = 0; j < 9 -(4-i); j++) {
					
					row = row + fields[i][j].getCell().toString()+" . ";
				}
			} else {
				for (int j = 0; j < i; j++) {
					space = space+"  ";
				}
				for (int j = 0; j < 13 - i; j++) {
					present = present+j+" . ";
				}
				for(int j = 0; j < 9 - (i-4); j++) {
					row = row + fields[i][j].getCell().toString()+" . ";
				}
			}
			visual = visual + "\n" + i + "." + space + row + space + i  + "." + space + present;
			//visual = visual + "\n" + i + "." + space + row; //without the representation
		}
		return visual;
	}
	
    /**@ensures appropriate ball out of board index will be incremented by 1
     */
	public void ballOutOfBoardType(cell type) {
		switch(type) {
			case X:
				this.outsideBallsX++;
				break;
			case Y:
				this.outsideBallsY++;
				break;
			case L:
				this.outsideBallsL++;
				break;
			case K:
				this.outsideBallsK++;
				break;
			case T:
				this.outsideBallsT++;
				break;
			case O:
				break;
		}
	}
	/**@ensures result >= 0
	 */
	public int getScore(cell type)	{
		int rt = 0;
		switch(type) {
			case X:
				rt = outsideBallsX;
				break;
			case Y:
				rt = outsideBallsY;
				break;
			case L:
				rt = outsideBallsL;
				break;
			case K:
				rt = outsideBallsK;
				break;
			case T:
				rt = outsideBallsT;
				break;
			case O:
				break;
		}
		return rt;
	}
	
	/**
	 *named badly only sets the type of the field 
	 */
	public void setField(int row, int ind, cell what) {
		this.fields[row][ind].changeType(what);
	}
	/**
	 * @requires row >= 0 && row <= 8 && ind >= 0 && ind <= 8, ind also ind has to be appropriate for the row,for example in most cases 8 will be invalid for ind
	 * 
	 */
	public void setFieldPropper(int row, int ind, Ball toWhat) {
		this.fields[row][ind] = toWhat;
	}
	
	/**
	 * @requires row >= 0 && row <= 8 && ind >= 0 && ind <= 8, ind also ind has to be appropriate for the row,for example in most cases 8 will be invalid for ind
	 * @ensure result == fields[row][ind]
	 */
	public Ball getField(int row, int ind){
		return this.fields[row][ind];
	}
	
	/**
	 * @requires row and index to be specified to know which ball is being moved
	 * @require where 1-6 represents direction, shown bellow
	 *   1 . 2
	 * 6 . 0 . 3
	 *   5 . 4
	 */
	public void moveBall(int row, int ind, int where) {
		int rhld = row;
		int ihld = ind;
		
		if(!fields[row][ind].isEmpty() && fields[row][ind].isMoveInBoard(where)) {
			fields[row][ind].move(where);
			if(fields[fields[rhld][ihld].getRow()][fields[rhld][ihld].getIndex()].isEmpty()) { 
				
				Ball hld = fields[fields[rhld][ihld].getRow()][fields[rhld][ihld].getIndex()];
				fields[fields[rhld][ihld].getRow()][fields[rhld][ihld].getIndex()]  = fields[rhld][ihld];
				fields[rhld][ihld] = hld;
			} else {
				fields[rhld][ihld].moveBack(where);
				System.out.println(" Moved back cause the field was taken");//debuging
			}
			
		}
	}
	/**
	 * @requires where <= 6 && where >= 1
	 * @ensures result != where
	 */
	public int reverseDirection(int where) {
		int rt=0;
		switch(where) {
			case 1:
				rt = 4;
				break;
			case 2:
				rt = 5;
				break;
			case 3:
				rt = 6;
				break;
			case 4:
				rt = 1;
				break;
			case 5:
				rt = 2;
				break;
			case 6:
				rt = 3;
				break;
		}
		return rt;
	}
	/**@requires rowi >= 0 && rowi <= 8 && where <= 6 && where >= 1 && indi >= 0 && indi <= 8, ind also ind has to be appropriate for the row,for example in most cases 8 will be invalid for ind
	 * @ensures result != fields[rowi][indi]
	 */
	public Ball getBallInDirection(int rowi, int indi, int where) {
		int row = rowi;
		int ind = indi;
		switch(where) {
			case 1:
				if(rowi < 5) ind = ind - 1;
				row = row - 1;
				break;
			case 2:
				if(rowi > 4) ind = ind + 1;
				row = row - 1;
				break;
			case 3:
				ind = ind + 1;
				break;
			case 4:
				if(rowi < 4) ind = ind + 1;
				row = row + 1;
				break;
			case 5:
				if(rowi >= 4) ind = ind - 1;
				row = row + 1;
				break;
			case 6:
				ind = ind - 1;
				break;
		}
		return fields[row][ind];
	}
	/**
	 * the reference ball is the last ball in line, it will look as it pushes the others
	 * @param row row of the reference ball
	 * @param ind index of the reference ball
	 * @param howMany has to be 1-3
	 * @param whereS direction what balls to select 
	 * @param whereM direction where to move
	 * 
	 */
	public void moveBalls(int row, int ind, int howMany, int whereS, int whereM ) {
		Ball ball1 = this.getField(row, ind);
		Ball ball2;
		Ball ball3;
		
		
		if(whereS == this.reverseDirection(whereM) && howMany>1) {//now whereM and WhereS can be opposite, no longer breaks fullMove();
			ball1 = this.getReferenceBall(row, ind, howMany-1, whereS);
			whereS=whereM;
		}
		switch(howMany) {
			case 1:
				this.moveBall(ball1.getRow(), ball1.getIndex(), whereM);
				break;
			case 2:
				ball2 = this.getBallInDirection(ball1.getRow(), ball1.getIndex(), whereS);
				if(getField(ball1.getRow(), ball1.getIndex()).getCell()==ball2.getCell()) {
					this.moveBall(ball2.getRow(), ball2.getIndex(), whereM);//array out of bounds exception
					this.moveBall(ball1.getRow(), ball1.getIndex(), whereM);
				}
				
				break;
			case 3:
				ball2 = this.getBallInDirection(ball1.getRow(), ball1.getIndex(), whereS);
				ball3 = this.getBallInDirection(ball2.getRow(), ball2.getIndex(), whereS);
				if(getField(ball1.getRow(), ball1.getIndex()).getCell()==ball2.getCell() && ball2.getCell() == ball3.getCell() ) {
					this.moveBall(ball3.getRow(), ball3.getIndex(), whereM);
					this.moveBall(ball2.getRow(), ball2.getIndex(), whereM);
					this.moveBall(ball1.getRow(), ball1.getIndex(), whereM);
				}
				break;
		}
	}
	//balls when they get pushed
	/**
	 * 
	 * @param row 0-8
	 * @param ind realistic, it depends on the row
	 * @param where 1-6, should be inversed for this to work properly
	 * @param weight 2 or 3 equal to size
	 */
	public void push(int row, int ind, int where, int weight, cell pushType) {
		Ball ball1 = getField(row, ind);
		Ball ball2 = null;
		Ball ball3 = null;
		try {
			ball2 = this.getBallInDirection(row, ind, where);
		} catch (Exception exc) {
			//hmmmm
		}
		try {
			ball3 = this.getBallInDirection(ball2.getRow(), ball2.getIndex(), where);
		} catch (Exception e) {
			//idk, this should work
		}
		
		switch(weight) {
			case 2:
				if(!ball1.isEmpty() && ball1.getCell() != pushType) {
					
					if(ball2==null) {
						ballOutOfBoardType(ball1.getCell());
						setField(row, ind, cell.O);	
					} else if(ball2.isEmpty()) {
						moveBall(row, ind, where);
					}
				}
				break;
			case 3:
				if(!ball1.isEmpty() && ball1.getCell() != pushType) {
					
					if(ball2==null) {
						ballOutOfBoardType(ball1.getCell());
						setField(row, ind, cell.O);	
					} else if(ball2.isEmpty()) {
						moveBall(row, ind, where);
						} else if (ball2.getCell() != pushType) {
						
							if(ball3==null) {
								ballOutOfBoardType(ball2.getCell());
								setField(ball2.getRow(), ball2.getIndex(), cell.O);
								moveBall(row, ind, where);
							} else if(ball3.isEmpty()) {
								moveBalls(row, ind, 2, where, where);
							}
						}
				}
				break;
		}
		
	}
	/**@requires howMany <= 3 && howMany >= 1
	 * @returns a ball at the end of the line of selected balls
	 */
	public Ball getReferenceBall(int row, int ind, int howMany, int whereS) {
		Ball ball2;
		Ball ball3;
		Ball refBall = null;
		switch(howMany) {
			case 1:
				refBall = this.getBallInDirection(row, ind, whereS);
				break;
			case 2:
				ball2 = this.getBallInDirection(row, ind, whereS);
				refBall = this.getBallInDirection(ball2.getRow(), ball2.getIndex(), whereS);
				break;
			case 3:
				ball2 = this.getBallInDirection(row, ind, whereS);
				ball3 = this.getBallInDirection(ball2.getRow(), ball2.getIndex(), whereS);
				refBall = this.getBallInDirection(ball3.getRow(), ball3.getIndex(), whereS);
				break;
		}
		return refBall;
	}
	
	public void fullMove(int row, int ind, int howMany, int whereS, int whereM) {
		Ball refBall = this.getReferenceBall(row, ind, howMany, whereS);
		if(howMany>1) {
			if(whereS == whereM ) {//to implement || whereS == reverseDirection(whereM)
				this.push(refBall.getRow(), refBall.getIndex(), whereM, howMany, this.getField(row, ind).getCell());
			} else if(whereS == this.reverseDirection(whereM)) {
				//needs a reference ball in the opposite direction, and whereM in the opposite direction
				refBall = this.getBallInDirection(row, ind, whereM);
				this.push(refBall.getRow(), refBall.getIndex(), whereM, howMany, this.getField(row, ind).getCell());
			}
			this.moveBalls(row, ind, howMany,  whereS,  whereM);
				
		} else { 
			this.moveBalls(row, ind, howMany,  whereS,  whereM);
		}
				
	}

}
