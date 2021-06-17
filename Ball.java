package startclass;

public class Ball {
	private cell type;
	private cell appear;
	private int row;
	private int ind;
	
	private boolean Empty;
	
	/**
0.  	  0 . 1 . 2 . 3 . 4
1.      0 . 1 . 2 . 3 . 4 . 5
2.    0 . 1 . 2 . 3 . 4 . 5 . 6
3.  0 . 1 . 2 . 3 . 4 . 5 . 6 . 7
4.0 . 1 . 2 . 3 . 4 . 5 . 6 . 7 . 8
5.  0 . 1 . 2 . 3 . 4 . 5 . 6 . 7
6.    0 . 1 . 2 . 3 . 4 . 5 . 6
7.      0 . 1 . 2 . 3 . 4 . 5
8.        0 . 1 . 2 . 3 . 4

  		 1 . 2
	 * 6 . 0 . 3
	 *   5 . 4
	 * @param type
	 * @param row should be between 0 - 8
	 * @param ind should be between 0 - 8
	 * 
	 */
	public Ball(cell type, int row, int ind) {
		this.appear = type;
		this.row = row;
		this.ind = ind;
		
		if(type == cell.X || type == cell.Y || type == cell.T ) {
			this.type = type;
		} else if(type == cell.K) {
			this.type = cell.X;
		} else if(type == cell.L) {
			this.type = cell.Y;
		}
		
		if(type == cell.O) {
			this.type = type.O;
			Empty = true;
		} else {
			Empty = false;
		}
	}
	
	public cell getCell() {
		return this.type;
	}
	
	public cell getApp() {
		return this.appear;
	}
	
	public void setApp(cell app) {
		this.appear = app;
	}
	
	public void makeEmpty() {
		this.Empty = true;
	}
	
	public boolean isEmpty() {
		return this.Empty;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public int getIndex() {
		return this.ind;
	}
	
	//changes the cell type of the ball
	public void changeType(cell type) {
		this.type = type;
		if(type == cell.O) {
			this.Empty = true;
			this.appear = cell.O;
		} else {
			this.Empty = false;
		}
	}
	
	public void changePosition(int row, int ind) {
		this.row = row;
		this.ind = ind;
	}
	/**
	 * @requires input to be indexes 1-6 show the direction where marble moves
	 *   1 . 2
	 * 6 . 0 . 3
	 *   5 . 4
	 *  @ensures new position corresponds to the one pointed at
	 */
	public void move(int where) {
		switch(where) {
			case 1:
				if(this.row < 5) this.ind = this.ind - 1;
				this.row = this.row - 1;
				
				break;
			case 2:
				if(this.row > 4) this.ind = this.ind + 1;
				this.row = this.row - 1;
				break;
			case 3:
				this.ind = this.ind + 1;
				break;
			case 4:
				if(this.row < 4) this.ind = this.ind + 1;
				this.row = this.row + 1;
				break;
			case 5:
				if(this.row >= 4) this.ind = this.ind - 1;
				this.row = this.row + 1;
				break;
			case 6:
				this.ind = this.ind - 1;
				break;
		}
	}
	/**moves the ball in the opposite direction
	 * 
	 *  @requires input to be indexes 1-6 show the direction where marble moves
	 *   1 . 2
	 * 6 . 0 . 3
	 *   5 . 4
	 *  @ensures result will be the opposite direction from input
	 */
	public void moveBack(int where) {
		switch(where) {
		case 1:
			this.move(4);
			break;
		case 2:
			this.move(5);
			break;
		case 3:
			this.move(6);
			break;
		case 4:
			this.move(1);
			break;
		case 5:
			this.move(2);
			break;
		case 6:
			this.move(3);
			break;
	}
	}
	/**
	 *  @requires input to be indexes 1-6 show the direction where marble moves
	 *   1 . 2
	 * 6 . 0 . 3
	 *   5 . 4
	 *  @ensures result==true if the pointed position is on the board
	 */
	public boolean isMoveInBoard(int where) {
		int row = this.row;
		int ind = this.ind;
		boolean rt = true;
		switch(where) {
		case 1:
			if(this.row < 5) ind = ind - 1;
			row = row - 1;
			break;
		case 2:
			if(this.row > 4) ind = ind + 1;
			row = row - 1;
			break;
		case 3:
			ind = ind + 1;
			break;
		case 4:
			if(this.row < 4) ind = ind + 1;
			row = row + 1;
			break;
		case 5:
			if(this.row >= 4) ind = ind - 1;
			row = row + 1;
			break;
		case 6:
			ind = ind - 1;
			break;
	}
		if(row < 5 && row>=0) {
			if(ind < 0 || ind > 4 + row) {
				rt = false;
			}
		} else if(row < 9) {
			if(ind < 0 || ind > 12 - row) {
				rt = false;
			}
		} else {
			rt = false;
		}
		return rt;
	}
}
