

import java.util.HashMap;
import java.util.Map;

public class Judge {

	private Map<Integer, String> quan = new HashMap<Integer, String>();

	public void putMethod() {
		quan.put(Player.shitou, "石头");
		quan.put(Player.jiandao, "剪刀");
		quan.put(Player.bu, "布");
	}

	private int player1_win_count = 0;
	private int player2_win_count = 0;

	public void startGame(Player player1, Player player2) {

		putMethod();
		System.out.println(player1.getName() + "\tVS.\t" + player2.getName());

		for (int i=0; i<3; i++) {
			oneRun(player1.showHand(), player2.showHand());
		}
		if (player1_win_count > player2_win_count) {
			System.out.println("结果: " + player1_win_count + " : " + player2_win_count + "\n" + player1.getName() + "获胜");
		}
		else if (player1_win_count < player2_win_count){
			System.out.println("结果: " + player1_win_count + ":" + player2_win_count + "\n" + player2.getName() + "获胜");
		}
		else {
			System.out.println("结果: " + player1_win_count + ":" + player2_win_count + "\n双方战平");
		}
	}

	public void oneRun(int hand1, int hand2) {

		System.out.println(quan.get(hand1) + "---" + quan.get(hand2));

		if ((hand1 == Player.shitou && hand2 == Player.jiandao)
			|| (hand1 == Player.jiandao && hand2 == Player.bu)
			|| (hand1 == Player.bu && hand2 == Player.shitou)) {

			player1_win_count += 1;

		}

		else if ((hand1 == Player.shitou && hand2 == Player.bu)
				|| (hand1 == Player.jiandao && hand2 == Player.shitou)
				|| (hand1 == Player.bu && hand2 == Player.jiandao)) {

			player2_win_count += 1;

		}


	}

}
