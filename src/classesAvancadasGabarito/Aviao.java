package classesAvancadasGabarito;

import util.Utilidades;

public class Aviao implements Voador {

	@Override
	public void decolar() {
		Utilidades.print("avião decolou");
	}

	@Override
	public void aterrisar() {
		Utilidades.print("avião aterrisou");
	}

	@Override
	public void voar() {
		 Utilidades.print("avião voou");
	}

}
