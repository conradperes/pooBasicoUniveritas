package herancaGabarito;

import java.math.BigDecimal;

public class Divisao extends Operacoes {

	public BigDecimal calculo(Double divisor, BigDecimal numero) {
		return numero.divide(new BigDecimal(divisor));
	}

}
