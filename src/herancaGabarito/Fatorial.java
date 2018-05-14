package herancaGabarito;

import java.math.BigDecimal;

public class Fatorial extends Operacoes {

	public BigDecimal calculo(Double fator, BigDecimal numero) {
		fator = (double) 1;
		for (int i = 1; i <= numero.intValue(); i++) {
			fator = fator * i;
			System.out.println(fator);
		}

		return new BigDecimal(fator);
	}

	public static float fatorialRecursivo(int n) {
		if (n == 0)
			return 1;
		else
			return n * fatorialRecursivo(n - 1);
	}

}
