package exceptionGabarito;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionSample {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("C:/teste.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}
}
