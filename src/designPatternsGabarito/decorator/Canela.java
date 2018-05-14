package designPatternsGabarito.decorator;

public class Canela extends CafeDecorator {

	public Canela(Cafe decoratedCafe) {
		super(decoratedCafe);
	}
	public double getCusto(){
		return super.getCusto()+0.1;
	}
	public String getIngredientes(){
		return super.getIngredientes()+ingredientSeparator+" canela";
	}
}
