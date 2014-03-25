package bowling_score_card;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameIntegrationTest {

	@Test
	public void allGutter() throws Exception {
		int[] rolls = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		assertEquals(0, scoreGame(rolls).totalScore());
	}

	@Test
	public void allGutterScoreSheet() throws Exception {
		int[] rolls = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		Game game = scoreGame(rolls);
		
		assertEquals("Dave's final score: 140\n" +
		"Frame\tRoll\tRoll\tScore\n" +
		"  1\t  -\t  -\t   0\n" +
		"  2\t  -\t  -\t   0\n" +
		"  3\t  -\t  -\t   0\n" +
		"  4\t  -\t  -\t   0\n" +
		"  5\t  -\t  -\t   0\n" +
		"  6\t  -\t  -\t   0\n" +
		"  7\t  -\t  -\t   0\n" +
		"  8\t  -\t  -\t   0\n" +
		"  9\t  -\t  -\t   0\n" +
		" 10\t  -\t  -\t   0\n" +
		"  *\t   \t   \t    \n", game.summary());
	}

//	@Test
//	public void noStrikesOrSpares() throws Exception {
//		int[] rolls = new int[]{1, 8, 2, 7, 3, 6, 4, 5, 5, 4, 6, 3, 7, 2, 8, 1, 1, 8, 2, 7};
//
//		assertEquals(90, scoreGame(rolls).totalScore());
//	}
//
//	@Test
//	public void spareLastFrame() throws Exception {
//		int[] rolls = new int[]{1, 8, 2, 7, 3, 6, 4, 5, 5, 4, 6, 3, 7, 2, 8, 1, 1, 8, 2, 8, 9};
//
//		assertEquals(100, scoreGame(rolls).totalScore());
//	}
//
//	@Test
//	public void strikeLastFrame() throws Exception {
//		int[] rolls = new int[]{1, 8, 2, 7, 3, 6, 4, 5, 5, 4, 6, 3, 7, 2, 8, 1, 1, 8, 10, 10, 10};
//
//		assertEquals(111, scoreGame(rolls).totalScore());
//	}
//	
//	@Test
//	public void perfectGame() throws Exception {
//		int[] rolls = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
//
//		assertEquals(300, scoreGame(rolls).totalScore());
//	}
//	
//	@Test
//	public void mixedGame() throws Exception {
//		int[] rolls = new int[]{10, 7, 3, 9, 0, 10, 0, 8, 8, 2, 0, 6, 10, 10, 10, 8, 1};
//
//		assertEquals(167, scoreGame(rolls).totalScore());
//	}
	
	private Game scoreGame(int[] rolls) {
		Game game = new Game("Dave");
		
		for (int i : rolls) {
			game.scoreRoll(i);
		}
		
		return game;
	}

}
