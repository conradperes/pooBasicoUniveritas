package collectionsGabarito;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapaPessoas {

	public static void main(String[] args) {
		Map<Integer, Pessoa> mapa = new HashMap<Integer, Pessoa>();
		mapa.put(99, new Pessoa("Conrad", 99, "Rua São Jose 90..."));
		mapa.put(1, new Pessoa("Edeverdison", 99, "Rua São Edevardison 90..."));
		mapa.put(7, new Pessoa("Jose", 99, "Rua São Jose da silva 90..."));
		mapa.put(77, new Pessoa("Maria", 99, "Rua São Maria 90..."));
		Pessoa pessoa = mapa.get(77);
		System.out.print(pessoa.getNome() + "\n");
		System.out.print(pessoa.getEndereco());
		pessoa = mapa.get(1);
		System.out.print(pessoa.getNome() + "\n");
		System.out.print(pessoa.getEndereco());
		pessoa = mapa.get(99);
		System.out.print(pessoa.getNome() + "\n");
		System.out.print(pessoa.getEndereco());
		// for (Entry<Integer, Pessoa> p : mapa.entrySet()) {
		// System.out.println(p);
		// }
	}

}
