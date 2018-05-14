package designPatternsGabarito;

import java.util.Date;

public class MasterCard implements MetodoPagamentoStrategy {

	private final String name;
	private final String cardNumber;
	private final Date expires;
	UtilPrint print = new UtilPrint();
    
	@Override
	public boolean pagar(double quantia) {
		assert(name!=null && cardNumber!=null && quantia>=1 ):false;
		print.log("PAgo pela MasterCard="+quantia);
		return true;
	}

	public MasterCard(String name, String cardNumber, Date expires) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.expires = expires;
	}

}

