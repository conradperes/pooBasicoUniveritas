package collectionsGabarito;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ListGabarito {

	public static void main(String[] args) {
		List listaLong = new ArrayList();
		listaLong.add(577777777);
		listaLong.add(4777777);
		listaLong.add(4777777);
		listaLong.add(277777);
		listaLong.add(177777);
		listaLong.add(477777);
		listaLong.add(477777);
		listaLong.add(47777);
		System.out.println(listaLong);
		List listaDouble = new ArrayList();
		listaDouble.add(5.366567);
		listaDouble.add(4.366567);
		listaDouble.add(4.366567);
		listaDouble.add(2.366567);
		listaDouble.add(1.366567);
		listaDouble.add(4.366567);
		listaDouble.add(4.366567);
		listaDouble.add(4.366567);
		listaDouble.add("Lucas Mello");
		listaDouble.add(new Date());
		listaDouble.add(new Pessoa("Mathues", 22, "Ipanema"));
		System.out.println(listaDouble);
	}

}
