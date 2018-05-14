package estruturaClasse;

public class Erros {

	int cont = 0;

	public static void main(String[] args) {
		/*
		 * Erro - não é possível acessar variáveis de instância a partir de métodos
		 * estáticos
		 */
		// cont = 5;//Não Funciona acessar variáveis de instância através de métodos
		// estáticos
		Erros erros = new Erros();
		erros.cont++;
		System.out.println("Variável de instância só pode ser utilizada em métodos estáticos através de instâncias ou objetos, exemplo="+erros.cont);
	}

}