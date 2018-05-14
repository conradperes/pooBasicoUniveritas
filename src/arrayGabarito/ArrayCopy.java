package arrayGabarito;

public class ArrayCopy {
	public static void main(String[] args) {
		// array original
		int elementos[] = { 1, 2, 3, 4, 5, 6, 7 };
		// novo array, maior
		int maiorArray[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		// copia todos os elementos do array elementos para o array maiorArray
		// come�ando pelo �ndice 0
		System.arraycopy(elementos, 0, maiorArray, 0, elementos.length);
		for (int elemento : maiorArray) {
			System.out.println(elemento);
		}
	}
}
