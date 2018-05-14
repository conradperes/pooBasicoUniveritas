package designPatternsGabarito.decorator;

public class Creme extends CafeDecorator {

	public Creme(Cafe decoratedCafe) {
		super(decoratedCafe);
	}
	
	public double getCusto(){
		return super.getCusto()+0.7;
	}
	public String getIngredientes(){
		return super.getIngredientes()+ingredientSeparator+" creme";
	}

}
