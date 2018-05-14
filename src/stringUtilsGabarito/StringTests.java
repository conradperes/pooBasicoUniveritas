package stringUtilsGabarito;

import util.Utilidades;

public class StringTests {

	public static void main(String[] args) {
		String s="Java Java Java Java";
		System.out.println(s.replace('a', 'c'));
		String s2 ="JavaLanguage";
		System.out.println(s2.substring(4,10));
		String s3 =s2;
		System.out.println(s3.toLowerCase());//resultado = �javalanguage� em nova �rea de mem�ria.
		System.out.println(s3.toUpperCase());
		
		
		String primeiraString="caixa";
		String segundaString="CaiXA";
		if(primeiraString.equalsIgnoreCase(segundaString)) 
			Utilidades.print("Strings Iguais!");
		else
			Utilidades.print("Strings Diferentes!");
	}

}
