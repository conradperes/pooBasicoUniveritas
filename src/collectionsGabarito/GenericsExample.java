package collectionsGabarito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class GenericsExample {
	public static void main(String[] args) {
		SortedSet<String> frutas = new TreeSet<String>();
		for (String fruta : Arrays.asList("mango", "apple", "banana", "banana")) {
			frutas.add(fruta);
		}
		System.out.print(frutas);
		List<Integer> numeros = new ArrayList<Integer>();
		for (Integer numero : Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)) {
			numeros.add(numero);
		}
		System.out.print("\n"+numeros);
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		for (Pessoa pessoa : Arrays.asList(
				new Pessoa("Marcio", 39, "endereco"), new Pessoa("Marcos", 59,
						"endereco"))) {
			pessoas.add(pessoa);
		}
		System.out.print("\n"+pessoas.get(1).getNome());
	}
}
