package designPatternsGabarito;

public class PasseioStrategy implements TemperaturaStrategy {

	@Override
	public boolean checaTemperatura(int temperaturaInf) {
		if ((temperaturaInf >= 50) && (temperaturaInf <= 90)) {
			return true;
		} else {
			return false;
		}
	}

}
