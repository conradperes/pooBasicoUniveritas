package classesAvancadasGabarito;

import java.util.Observable;

import designPatternsGabarito.Dog;
import designPatternsGabarito.UtilPrint;

public class SiberianHusky implements Dog {
	public static final String CRITERIO = "LOBO";
	UtilPrint print = new UtilPrint();

	@Override
	public void latir() {
		print.log("latido de montanha igual a um Lobo!");

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
