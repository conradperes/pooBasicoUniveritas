package exceptionGabarito;

import java.io.IOError;
import java.io.IOException;

public class TesteMultiException {
	public static final int MINIMUM = 1;
	public static final int MAXIMUM = 15;
	public static void main(String[] args) {
		try {
			int randomValue = MINIMUM + (int) (Math.random() * MAXIMUM);
			if (randomValue <= 5) {
				throw new IOException("Ocorrido IOException");
			} else if (randomValue <= 10) {
				throw new IOError(new Throwable("Ocorrido IOError"));
			} else {
				throw new InternalError("Ocorrido InternalError");
			}
		} catch (IOException | IOError | InternalError e) {
			System.out.println(String.format("Falha lan?ada para teste: %s",
					e.getMessage()));
		}
	}
}
