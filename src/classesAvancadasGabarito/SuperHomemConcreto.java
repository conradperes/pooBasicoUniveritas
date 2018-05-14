package classesAvancadasGabarito;

public class SuperHomemConcreto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Voador voador = new SuperHomem();// Instanciando a interface usando
											// polimorfismo e encapsulando a
											// implementação do método decolar
		voador.decolar();
	}

}
