package bowling_score_card;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {
	@Test
	public void player_returns_players_name() throws Exception {
		Game game = new Game("Dave");
		
		assertEquals("Dave", game.player());
	}

	@Test
	public void currentFrame_returns_current_frame() throws Exception {
		Game game = new Game("Dave");
		
		assertEquals(new Frame(1), game.currentFrame());
	}
}
