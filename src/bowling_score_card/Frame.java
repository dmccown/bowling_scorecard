package bowling_score_card;

public class Frame {
	private int currentFrame;

	public Frame(int currentFrame) {
		this.currentFrame = currentFrame;
	}

	public boolean isComplete() {
		return false;
	}

	public void addRoll(int pins) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "  " + currentFrame + "\t  " + first + "\t  " + second + "\t   " + score;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentFrame;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Frame other = (Frame) obj;
		if (currentFrame != other.currentFrame)
			return false;
		return true;
	}


}
