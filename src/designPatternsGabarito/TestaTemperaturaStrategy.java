package designPatternsGabarito;

import javax.swing.JOptionPane;

public class TestaTemperaturaStrategy {

	public static void main(String[] args) {
		String temperatura = JOptionPane.showInputDialog(null,
				"Digite a temperatura:");
		int temperatureInF = new Integer(temperatura);

		TemperaturaStrategy skiStrategy = new SkiStrategy();
		Context context = new Context(temperatureInF, skiStrategy);

		System.out.println("Essa ?? temperatura (" + context.getTemperatureInF() + "F) boa pra ski? " + context.getResult());

		TemperaturaStrategy hikeStrategy = new PasseioStrategy();
		context.setStrategy(hikeStrategy);

		System.out.println("Essa ?? temperatura (" + context.getTemperatureInF() + "F) boa para passeio? " + context.getResult());

	}

}
