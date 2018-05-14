package estruturaClasse;
import util.Utilidades;
public class VariavelBloco {
	public static void main(String[] args) {
		{
			int a=1000;
			Utilidades.print(a);
		}
		{
			int b=77777;
			Utilidades.print(b);
		}
		{
			int b=99999;
			Utilidades.print(b);
		}
	}
}
