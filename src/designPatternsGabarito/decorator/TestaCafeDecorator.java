package designPatternsGabarito.decorator;

public class TestaCafeDecorator {

	public static void main(String[] args) {
		Cafe c = new CafeExpresso();
		printDecorator(c);
		c = new Leite(c);
		printDecorator(c);
		c = new Creme(c);
		printDecorator(c);
		c = new Canela(c);
		printDecorator(c);
		c = new Canela(c);//repare que esta sendo adicionado outra canela na decoração
		printDecorator(c);
		c = new Canela(c);
		printDecorator(c);
	}

	private static void printDecorator(Cafe c) {
		System.out.println("Custo: " + c.getCusto() + "; Ingredientes: "
				+ c.getIngredientes());
	}

}
