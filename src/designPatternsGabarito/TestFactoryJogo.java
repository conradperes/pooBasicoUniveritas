package designPatternsGabarito;

import javax.swing.JOptionPane;

public class TestFactoryJogo {
	public static void main(String[] args) {
		String tipoJogo = JOptionPane.showInputDialog(null,
				"Selecione o jogo 1-poker 2-Sueca");
		Integer tpJogo = new Integer(tipoJogo);
		if (tpJogo.equals(1)) {
			Poker poker = (Poker) FactoryJogo.getInstance(Poker.TIPO);
			poker.fullHouse();
			poker.blefe();
			poker.blackJack();
			poker.allIn();
		}
		if (tpJogo.equals(2)) {
			Sueca sueca = (Sueca) FactoryJogo.getInstance(Sueca.TIPO);
			sueca.ganhandoMao();
			sueca.jogouUmAs();
			sueca.usandoTrunfo();
			sueca.ganhouJogo();
		}
		assert (tpJogo.equals(1) || tpJogo.equals(2)) : "Oh meu amigo usu??rio s?? temos 2 jogos dispon??veis!";
	}

}
