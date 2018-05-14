package classesInterfaces;
import util.Utilidades;
public class Teste {

	public Teste() {
		int x = 0;
		Utilidades.print(x);
	}

	public void teste() {
		int x = 1;
		Utilidades.print(x);
	}

	static {
		int x = 2;
		Utilidades.print(x);
	}

	public static void main(String[] args) {
		Teste teste = new Teste();
		teste.teste();
	}
}
