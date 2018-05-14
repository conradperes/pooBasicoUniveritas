package exceptionGabarito;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExemploThrows {
	public static void main(String[] args) {
		try {
			abrirArquivo();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void abrirArquivo() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("teste.txt");
	}
}
