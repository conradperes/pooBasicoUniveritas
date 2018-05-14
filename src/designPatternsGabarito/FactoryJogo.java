package designPatternsGabarito;

public class FactoryJogo {
	public static Jogo getInstance(String tipo) {

		if (tipo.equals(Poker.TIPO))
			return new Poker();
		if (tipo.equals(Sueca.TIPO))
			return new Sueca();
		else
			return null;
	}

}
