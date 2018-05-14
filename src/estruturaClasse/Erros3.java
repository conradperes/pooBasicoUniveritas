package estruturaClasse;
import util.Utilidades;
public class Erros3 {
	void teste() {
		for (int i = 0; i < 10; i++) {
			int cod = 1;
			if (cod == 1)
				cod++;
		}
		/*
		 * Erro - não é possível acessar uma variável de bloco depois que o bloco
		 * terminou a execução
		 */
		Utilidades.print(cod);
	}
}