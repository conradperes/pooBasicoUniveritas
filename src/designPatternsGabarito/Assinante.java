package designPatternsGabarito;

import java.util.Observable;
import java.util.Observer;

public class Assinante implements Observer {
	Observable canalCombate;
	int lutaNumero;
	public Assinante(Observable canalCombate) {
		this.canalCombate = canalCombate;
		canalCombate.addObserver(this);
	}
	@Override
	public void update(Observable canalCombateSubject, Object arg1) {
		if (canalCombateSubject instanceof CanalCombateNetVirtua) {
			CanalCombateNetVirtua canalCombate = (CanalCombateNetVirtua) canalCombateSubject;
			lutaNumero = canalCombate.getEdicao();
			System.out
					.println("Aten??o, Vai ter uma nova luta do Anderson Silva Hoje. "
							+ "Luta n?mero: " + lutaNumero);
		}
	}
}
