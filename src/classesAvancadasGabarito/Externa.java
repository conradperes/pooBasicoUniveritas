package classesAvancadasGabarito;

public class Externa {

	private static int contadorEstatico = 0;
	int contadorNaoEstatico = 0;
	
	public static class Interna{
		public void facaInterior(){
			System.out.println(contadorEstatico);
		}
	}

}
