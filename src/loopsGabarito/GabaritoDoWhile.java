package loopsGabarito;

public class GabaritoDoWhile {

	public static void main(String[] args) {
		int i = 0;
		do {
			int resultado = i*7;
			System.out.printf("Multiplica��o= %d \n",resultado );
			i++;
		} while (i <= 500);
		System.out.println("agora terminou!");
	}

}
