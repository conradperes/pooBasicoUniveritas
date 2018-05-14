package designPatternsGabarito;

import java.util.Observable;


public class RottWeiler implements Dog {
	public static final String CRITERIO = "ASSUSTADOR";
	UtilPrint print = new UtilPrint();

	@Override
	public void latir() {
		print.log("latido assustador!");

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
