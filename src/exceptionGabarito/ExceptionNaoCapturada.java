package exceptionGabarito;

public class ExceptionNaoCapturada {
	public static void main(String[] args) {
		int i =0;
		try {
			String array[]={"acapulco","bariloche","aruba"};
			while(i<4){
				System.out.println(array[i]);
				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Resetando o valor do índice");
			i=0;
		}finally{
			System.out.println("Será sempre impresso");
		}
	}
}
