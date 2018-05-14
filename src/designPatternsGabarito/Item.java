package designPatternsGabarito;

public class Item {
	
	Item(double preco) {
		super();
		this.preco = preco;
	}

	private double preco;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
