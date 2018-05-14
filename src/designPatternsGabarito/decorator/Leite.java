package designPatternsGabarito.decorator;

public class Leite extends CafeDecorator {

	public Leite(Cafe decoratedCafe) {
		super(decoratedCafe);
	}
	public double getCusto(){
		return super.getCusto()+0.5;
	}
	public String getIngredientes(){
		return super.getIngredientes()+ingredientSeparator+" leite";
	}

}
