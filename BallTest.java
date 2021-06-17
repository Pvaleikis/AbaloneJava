package tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import startclass.Ball;
import startclass.cell;

class BallTest {

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	void moveTest() {
		Ball ball = new Ball(cell.X, 0, 0);
		Ball ball2 = new Ball(cell.K, 6, 3);
		ball.move(3);
		ball2.move(3);
		assertEquals(ball.getRow(), 0);
		assertEquals(ball.getIndex(), 1);
		assertEquals(ball2.getRow(), 6);
		assertEquals(ball2.getIndex(), 4);
		ball = new Ball(cell.X, 5, 2);
		ball2 = new Ball(cell.K, 7, 5);
		ball.move(2);
		ball2.move(2);
		assertEquals(ball.getRow(), 4);
		assertEquals(ball.getIndex(), 3);
		assertEquals(ball2.getRow(), 6);
		assertEquals(ball2.getIndex(), 6);
		
	}
	
	@Test
	void moveBackTest() {
		Ball ball = new Ball(cell.O, 0, 0);
		ball.moveBack(6);
		assertTrue(ball.getRow()==0);
		assertTrue(ball.getIndex()==1);
		ball.moveBack(1);
		assertTrue(ball.getRow()==1);
		assertTrue(ball.getIndex()==2);
		
	}
	
	@Test
	void isMoveOnBoardTest() {
		Ball[] balls = {new Ball(cell.X, 0, 0),new Ball(cell.X, 8, 4), new Ball(cell.X, 2, 2), new Ball(cell.X, 6, 3)};
		
		assertFalse(balls[0].isMoveInBoard(1));
		assertFalse(balls[1].isMoveInBoard(3));
		assertTrue(balls[2].isMoveInBoard(5));
		assertTrue(balls[3].isMoveInBoard(5));
	}
	
	@Test
	void setUptest(){
		Ball ball = new Ball(cell.X, 0, 0);
		Ball ball2 = new Ball(cell.K, 6, 3);
		assertEquals(ball.getCell(), ball2.getCell());
		assertFalse(ball.getApp()==ball2.getApp());
		
		ball2 = new Ball(cell.L, 6, 3);
		assertFalse(ball.getCell()==ball2.getCell());
			
	}

}
