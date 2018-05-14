package classesAvancadasGabarito;

public class Teste {

	public Teste() {
		int x=0;
		log(x);
	}
	public void teste(){
		int x=1;
		log(x);
	}
	static {
		int x = 2;
		log(x);
	}

	public static void main(String[] args) {
		Teste teste = new Teste();
		teste.teste();
	}

	public static void log(Object obj) {
		System.out.println(obj);
	}
}
