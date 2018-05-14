package operadoresGabarito;

public class OperadorLogico {

	public static void main(String[] args) {

		int x = 199, y = 199;
		int w = 100;
		int h = 99;
		if (x == y) 
			System.out.printf("%d � igual a %d \n", x, y);
		
		if(w>=h)
			System.out.printf("%d � maior ou igual a %d \n", w, h);
		
		if(h<=w)
			System.out.printf("%d � menor ou igual a %d \n", h, w);
		
		if(x!=h)
				System.out.printf("%d � diferente de %d \n", x, h);
			
		
	}

}
