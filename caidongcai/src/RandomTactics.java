

public class RandomTactics implements Tactics {

	public int readTactics() {

		int hand = (int)(Math.random() * 3);
		return hand;
	}
}
