package estruturaClasse;
public class Erros2 {
	void teste() {
        int x = 5;
        int y = 10;
        teste2();
  }
  void teste2() {
        /* Erro - um método não pode
         * acessar as variáveis locais
         * de outro método */
        x = 50;
  }
}
