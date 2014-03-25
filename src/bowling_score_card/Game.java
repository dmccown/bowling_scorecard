package bowling_score_card;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private String player;
	private int score;
	private List<Frame> frames = new ArrayList<>();

	public Game(String player) {
		this.player = player;
		for (int i = 0; i < 10; i++) {
			frames.add(new Frame(i + 1));
		}
	}
	
	public void scoreRoll(int pins) {
		Frame frame = currentFrame();
		frame.addRoll(pins);
	}
	
	public int totalScore() {
		return 0;
	}
	
	public String player() {
		return player;
	}

	public Frame currentFrame() {
		for (Frame frame : frames) {
			if(!frame.isComplete()) {
				return frame;
			}
		}
		return null;
	}

	public String summary() {
		String description = "Dave's final score: " + totalScore() + "\n\n";
		String headers = "Frame\tRoll\tRoll\tScore\n";
		String rows = "";
		for (Frame frame : frames) {
			rows += frame.toString() + "\n";
		}
		return description + headers + rows;	
	}
}
