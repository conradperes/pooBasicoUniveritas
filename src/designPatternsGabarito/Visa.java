package designPatternsGabarito;

import java.util.Date;

public class Visa implements MetodoPagamentoStrategy {
	private final String name;
	private final String cardNumber;
	private final Date expires;
	UtilPrint print = new UtilPrint();
    
	@Override
	public boolean pagar(double quantia) {
		assert(name!=null && cardNumber!=null && quantia>=1 ):false;
		print.log("PAgo pela Visa="+quantia);
		return true;
	}

	public Visa(String name, String cardNumber, Date expires) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.expires = expires;
	}

}
