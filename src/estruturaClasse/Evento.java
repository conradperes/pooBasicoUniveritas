package estruturaClasse;
import java.util.Date;
import util.Utilidades;
public class Evento {
	public static void main(String[] args) {
        /* É preciso iniciar a variável local do tipo objeto 
         * caso contrário dá erro de compilação */
        Date date = null;
        /* erro -  variáveis locais do tipo
         * objeto não possuem valor, portanto,
         * enquanto não receberem explicitamente
         * o valor null ou qualquer outro não
         * poderão ser utilizadas */
        if (date == null)
              date = new Date();
        date = new Date();
        Utilidades.print(date);
  }
}
