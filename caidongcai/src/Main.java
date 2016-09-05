
public class Main {

	public static void main(String[] args) {
		// TODO 哈哈
		Player xiaoming = new Player("小明");
		Player ligang = new Player("李刚");
		Judge caipan = new Judge();
		RandomTactics xiaomingTactic = new RandomTactics();
		RandomTactics ligangTactic = new RandomTactics();
		xiaoming.setTactics(xiaomingTactic);
		ligang.setTactics(ligangTactic);
		caipan.startGame(xiaoming, ligang);
	}

}
