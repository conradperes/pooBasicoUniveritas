package collectionsGabarito;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet numeros = new TreeSet();
		for (Integer numero : Arrays.asList(4, 3, 2, 1, 3,99999)) {
			numeros.add(numero);
		}
		System.out.println(numeros);
		SortedSet frutas = new TreeSet();
		for (String fruta : Arrays.asList("mango", "apple", "banana", "banana")) {
			frutas.add(fruta);
		}
		System.out.println(frutas);
	}
}
