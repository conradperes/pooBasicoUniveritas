package designPatternsGabarito;

import javax.swing.JOptionPane;

import classesAvancadasGabarito.SiberianHusky;

public class TesteFactoryAnimal {

	public static void main(String[] args) {

		
		String tipoCachorro = JOptionPane.showInputDialog(null,
				"Selecione o Cachorro 1-poodle 2-rottweiler 3-husky siberiano");
		Integer tpCachorro = new Integer(tipoCachorro);
		if (tpCachorro.equals(1)) {
			Poodle poodle = (Poodle) FactoryDog.getInstance(Poodle.CRITERIO);
			poodle.latir();
		}
		if (tpCachorro.equals(2)) {
			RottWeiler rottWeiler = (RottWeiler) FactoryDog.getInstance(RottWeiler.CRITERIO);
			rottWeiler.latir();
		}
		if (tpCachorro.equals(3)) {
			SiberianHusky siberianHusky = (SiberianHusky) FactoryDog.getInstance(SiberianHusky.CRITERIO);
			siberianHusky.latir();
		}
		assert (tpCachorro.equals(1) || tpCachorro.equals(2) || tpCachorro.equals(2)) : "Op????o Inv??lida";
	}

}
