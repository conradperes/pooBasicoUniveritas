package collectionsGabarito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCarro {
	public static void main(String[] args) {
		Carro carro = new Carro("volkswagen", "2013");
		Carro carro1 = new Carro("GM", "2013");
		Carro carro2 = new Carro("Citroen", "2013");
		List<Carro> lista = new ArrayList<Carro>();
		lista.add(carro);
		lista.add(carro1);
		lista.add(carro2);
		Collections.sort(lista);
		for (Carro carro3 : lista) {
			System.out.println(carro3.getMarca());
		}
	}
}
