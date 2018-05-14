package designPatternsGabarito;

public class Context {

	int temperatureInF;
	TemperaturaStrategy strategy;

	public Context(int temperatureInF, TemperaturaStrategy strategy) {
		this.temperatureInF = temperatureInF;
		this.strategy = strategy;
	}

	public void setStrategy(TemperaturaStrategy strategy) {
		this.strategy = strategy;
	}

	public int getTemperatureInF() {
		return temperatureInF;
	}

	public boolean getResult() {
		return strategy.checaTemperatura(temperatureInF);
	}

}
