package herancaGabarito;

import java.math.BigDecimal;

public class Operacoes {

	public BigDecimal calculo(Double d , BigDecimal c){
		BigDecimal numero = new BigDecimal(d);
		return numero.add(c);
	}
}
