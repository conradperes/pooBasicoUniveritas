package designPatternsGabarito;

public class Poker extends Jogo {
	public static final String TIPO = "POKER";
	UtilPrint print = new UtilPrint();

	public void blackJack() {
		print.log("Jogador fez BlackJack");
	}

	public void fullHouse() {
		print.log("Jogador fez FullHouse");
	}

	public void allIn() {
		print.log("Jogador jogou todas as pe??as");
	}

	public void blefe() {
		print.log("Hummm rolou um blefe");
	}
}
