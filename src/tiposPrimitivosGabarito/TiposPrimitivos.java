package tiposPrimitivosGabarito;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// declaração de variáveis inteiras
		int x, y;
		// declaraão e atribuião de pontos flutuantes do tipo float
		float z = 3.414f;
		// declaraão e atribuião do tipo double
		double w = 3.1415;
		// declaraão e atribuião do tipo boolean
		boolean truth = true;
		// declaraão do tipo char
		char c;
		// declaraão e atribuião do tipo String
		// String str="Ol�!!!";
		// atribuião do tipo char
		c = 'A';
		// Sobrescrevendo valor inicial
		// str = "outro valor!";
		// atribuindo valores diferentes as variáveis int criadas acima
		x = 6;
		y = 1000;
		System.out.println("Vari�vel Inteira --> Valor de x=  "+ x +" e y= "+y);
		System.out.println("Vari�vel Ponto Flutuante --> Valor de w=  "+ w +" z= "+z);
		System.out.println("Vari�vel boolean --> Valor de truth=  "+ truth );
		System.out.println("Vari�vel char --> Valor de c=  "+ c );
		System.out.println("Produto da equa��o de (x+y) -->  "+ (x+y) );
		System.out.println("Produto da equa��o de ((x+y)*(w*z)) -->  "+ ((x+y)*(w*z)) );
		System.out.println("Produto de w*z -->  "+ (w*z) );
	}
}
