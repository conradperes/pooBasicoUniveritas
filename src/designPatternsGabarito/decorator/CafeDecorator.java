package designPatternsGabarito.decorator;

public class CafeDecorator extends Cafe {
	protected final Cafe decoratedCafe;
    protected String ingredientSeparator = ", ";

	public CafeDecorator(Cafe decoratedCafe) {
		this.decoratedCafe = decoratedCafe;
	}

	@Override
	public double getCusto() {
		return decoratedCafe.getCusto();
	}

	@Override
	public String getIngredientes() {
		return decoratedCafe.getIngredientes();
	}

}
