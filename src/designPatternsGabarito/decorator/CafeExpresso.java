package designPatternsGabarito.decorator;

public class CafeExpresso extends Cafe {


	@Override
	public double getCusto() {
		return 3;
	}

	@Override
	public String getIngredientes() {
		return "Café forte";
	}

}
