package tiposPrimitivosGabarito;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// declaraÃ§Ã£o de variÃ¡veis inteiras
		int x, y;
		// declaraÃ£o e atribuiÃ£o de pontos flutuantes do tipo float
		float z = 3.414f;
		// declaraÃ£o e atribuiÃ£o do tipo double
		double w = 3.1415;
		// declaraÃ£o e atribuiÃ£o do tipo boolean
		boolean truth = true;
		// declaraÃ£o do tipo char
		char c;
		// declaraÃ£o e atribuiÃ£o do tipo String
		// String str="Olï¿½!!!";
		// atribuiÃ£o do tipo char
		c = 'A';
		// Sobrescrevendo valor inicial
		// str = "outro valor!";
		// atribuindo valores diferentes as variÃ¡veis int criadas acima
		x = 6;
		y = 1000;
		System.out.println("Variável Inteira --> Valor de x=  "+ x +" e y= "+y);
		System.out.println("Variável Ponto Flutuante --> Valor de w=  "+ w +" z= "+z);
		System.out.println("Variável boolean --> Valor de truth=  "+ truth );
		System.out.println("Variável char --> Valor de c=  "+ c );
		System.out.println("Produto da equação de (x+y) -->  "+ (x+y) );
		System.out.println("Produto da equação de ((x+y)*(w*z)) -->  "+ ((x+y)*(w*z)) );
		System.out.println("Produto de w*z -->  "+ (w*z) );
	}
}
