

public class Player {

	public static final int shitou = 0;
	public static final int jiandao = 1;
	public static final int bu = 2;


	private String name_;
	private Tactics tactics_;

	public void setTactics(Tactics tactics) {

		tactics_ = tactics;
	}

	public Player (String name) {

		name_ = name;
	}

	public String getName() {

		return name_;
	}

	public int showHand() {

		int hand = tactics_.readTactics();
		return hand;

	}

}
