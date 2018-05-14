package exceptionGabarito;

public class ExceptionCapturada {
	public static void main(String[] args) {
		int i = 0;
		try {
			String array[] = { "acapulco", "bariloche", "aruba" };
			while (i < 4) {
				System.out.println(array[i]);
				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Resetando o valor do ?ndice");
			i = 0;
		} finally {
			System.out.println("Ser? sempre impresso");
		}
	}
}
