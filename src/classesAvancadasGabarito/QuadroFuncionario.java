package classesAvancadasGabarito;

import herancaGabarito.Gerente;
import herancaGabarito.Secretaria;

public class QuadroFuncionario {

	public static void main(String[] args) {
		Gerente empregado = new Gerente() {
			public void trabalhar() {
				System.out.println("mandar");
			}
		};
		empregado.trabalhar();

		Secretaria peao = new Secretaria() {
			public void trabalhar() {
				System.out.println("executar");
			}
		};
		peao.trabalhar();
	}

}
