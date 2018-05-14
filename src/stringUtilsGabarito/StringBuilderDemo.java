package stringUtilsGabarito;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder("Conrad Marques Peres");
		System.out.printf(
				" buffer = %s\n tamanho = %d\n capacidade (%d (tamanho) + "
						+ "16(valor inicial padr�o)) = %d\n\n", buffer
						.toString(), buffer.length(), buffer.length(), buffer
						.capacity());

		// EXPANDE A CAPACIDADE P/ 1779 CARACTERES
		buffer.ensureCapacity(1779);
		System.out.printf("Nova Capacidade = %d\n\n", buffer.capacity());

		// REDEFINE O TAMANHO, N�O APARECENDO OS CARACTERES
		// SE O ARGUMENTO FOR MENOR QUE A QUANTIDADE DE CARACTERES ORIGINAL
		buffer.setLength(10);
		System.out.printf("Novo tamanho = %d\n buffer = %s\n", buffer.length(),
				buffer.toString());
		
		
		
		System.out.printf("buffer = %s\n", buffer.toString());
        System.out.printf("Caractere index 0: %s\nCaractere index 4: " +
                "%s\n\n",buffer.charAt(0),buffer.charAt(4));
         
        char[] charArray = new char[buffer.length()];
         
        buffer.getChars(0, buffer.length(), charArray, 0);
        System.out.print("Os caracteres s�o: ");
         
        for(char c : charArray)
            System.out.print(c);
         
        buffer.setCharAt(0, 'O');
        buffer.setCharAt(4, 'P');
         
        System.out.printf("\n\nbuffer = %s", buffer.toString());
         
        buffer.reverse();
        System.out.printf("\n\nbuffer = %s\n", buffer.toString());


		
		Object objetoRef = "Maria";
        String String = "Joaquina";
        char[] conjArray = {'S','i','l','v','a'};
 
        StringBuilder builder = new StringBuilder();
        builder.insert(0, objetoRef);
        builder.insert(0, " ");
        builder.insert(0, String);
        builder.insert(0, " ");
        builder.insert(0, conjArray);
        builder.insert(0, " ");
         
        System.out.printf("Valores:\n%s\n\n", builder.toString());  



	}

}
