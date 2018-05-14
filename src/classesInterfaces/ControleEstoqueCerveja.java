package classesInterfaces;

import util.Utilidades;

public class ControleEstoqueCerveja {

	public static void main(String[] args) {
		Cerveja cerveja = new Cerveja();
		cerveja.setLitros(1000);
		cerveja.setEstilo("GOLDEN ALE");
		Utilidades.print("Estoque antes do consumo="+cerveja);
		cerveja.consumoCerveja(50);
		Utilidades.print("Estoque depois do consumo="+cerveja);
	}

}
