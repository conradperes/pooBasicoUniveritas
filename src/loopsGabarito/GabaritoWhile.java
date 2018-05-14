package loopsGabarito;

public class GabaritoWhile {

	public static void main(String[] args) {
		for (long l = 0; l < 1000; l++) {
			if (l % 2 == 0)
				System.out.printf("Eh par %d \n", l);
			else
				System.out.printf("Eh �mpar %d \n", l);
		}
	}
}
