package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import startclass.Ball;
import startclass.Board;
import startclass.cell;


class BoardTest {
	private Board board;
	@BeforeEach
	void setUp() throws Exception {

		board = new Board();
	}

	@Test
	public void testMoveBall() {
		board.setUpBoard(0);
		final Ball ball1 = board.getField(2, 4);
		final Ball ball2 = board.getBallInDirection(2, 4, 4);
		board.moveBall(2, 4, 4);
		assertEquals(ball1, board.getBallInDirection(2, 4, 4));
		assertEquals(ball2, board.getField(2, 4));

	}

	@Test
	public void testFullMove() {
		board.setUpBoard(0);
		board.fullMove(2, 2, 3, 3, 3);
		assertEquals(1, board.getScore(cell.Y));
		board.fullMove(2, 5, 3, 6, 3);
		assertEquals(2, board.getScore(cell.Y));
	}
}
