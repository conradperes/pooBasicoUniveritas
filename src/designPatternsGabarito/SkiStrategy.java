package designPatternsGabarito;

public class SkiStrategy implements TemperaturaStrategy {

	@Override
	public boolean checaTemperatura(int temperaturaInf) {
		if (temperaturaInf <= 32) {
			return true;
		} else {
			return false;
		}
	}

}
