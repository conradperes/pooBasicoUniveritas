package designPatternsGabarito;

import java.util.Observable;


public class Poodle implements Dog {
	public static final String CRITERIO = "INOFENSIVO";
	UtilPrint print = new UtilPrint();
	@Override
	public void latir() {
		print.log("latido fino!");
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
