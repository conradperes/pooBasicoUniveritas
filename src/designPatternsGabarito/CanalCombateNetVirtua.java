package designPatternsGabarito;

import java.util.Observable;

public class CanalCombateNetVirtua extends Observable {
	private int lutaNumero;
	public void setNovaEdicao(int lutaNumero) {
		this.lutaNumero = lutaNumero;

		setChanged();
		notifyObservers();
	}
	public int getEdicao() {
		return this.lutaNumero;
	}
	public static void main(String[] args) {
		// poderia receber a nova edicao atraves de um recurso externo
		int lutaNumero = 11;
		CanalCombateNetVirtua canal = new CanalCombateNetVirtua();
		Assinante assinante1 = new Assinante(canal);

		canal.setNovaEdicao(lutaNumero);
	}
}
