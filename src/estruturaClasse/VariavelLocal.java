package estruturaClasse;
import util.Utilidades;
public class VariavelLocal {
	public static void main(String[] args) {
		int lado = 0;
		Utilidades.print(lado);
        lado = 4;
        Utilidades.print(lado);
        //var primitiva local não-inicializada
        double area = 0;
        /* variável primitiva local sendo
         * inicializada dentro de um bloco
         * condicional; ou seja, pode ou não ser
         * inicializada */
        if (lado == 4)
              area = 16;
        Utilidades.print(area);
	}
}
