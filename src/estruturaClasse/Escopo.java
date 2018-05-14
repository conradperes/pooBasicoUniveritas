package estruturaClasse;

import java.util.Date;

public class Escopo {
	// variável estática
	static int contador = 0;
	// variável de instância
	String nome = "";

	{
		// variável de bloco
		Date dtNasc = new Date();
	}

	void test() {
		// variável local
		String cpf = "000.000.000-00";
	}

	public static void main(String[] args) {
		contador++;
		System.out.println(contador);
	}

}