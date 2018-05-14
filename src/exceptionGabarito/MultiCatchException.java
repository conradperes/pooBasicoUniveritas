package exceptionGabarito;

public class MultiCatchException {

	public static void main(String[] args) {
		catchTradicional();
		multiCatch();

	}
	private static void multiCatch() {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException | IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
		    System.out.println("Erro: " + e.getMessage());
		}
	}

	private static void catchTradicional() {
		try {
		    System.out.println(10 / 0);
		} catch (ArithmeticException e) {
		    System.out.println("Erro: " + e.getMessage());
		} catch (IllegalArgumentException e) {
		    System.out.println("Erro: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("Erro: " + e.getMessage());
		}
	}

}
