package collectionsGabarito;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map mapa = new HashMap();
		mapa.put(99, new Date());
		mapa.put(1, "Nome de Cliente");
		mapa.put(7, 7777.777);
		mapa.put(77, 7777.777);
		System.out.print(mapa.get(7)+"\n");
		System.out.print(mapa.get(77)+"\n");
		System.out.print(mapa.get(99)+"\n");
		System.out.print(mapa.get(1));
	}
}
