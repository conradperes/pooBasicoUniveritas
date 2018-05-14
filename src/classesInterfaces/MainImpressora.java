package classesInterfaces;

public class MainImpressora {

	public static void main(String[] args) {
		Impressora impressora = new Impressora("C:\\contracheque.pdf");
		impressora.imprimirDocumento();
	}

}
