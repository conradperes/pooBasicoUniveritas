package designPatternsGabarito;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;

public class CarrinhoCompras extends Observable{
	private final List<Item> items;
	private MetodoPagamentoStrategy method;

	public CarrinhoCompras() {
		items = new ArrayList<Item>();

	}

	public void addItem(Item item) {

		items.add(item);
		setChanged();
		notifyObservers();
	}

	public List<Item> getItems() {
		return items;
	}

	public double calcTotalCost() {
		double total = 0.0;
		for (Item item : items) {
			total += item.getPreco();
		}

		return total;
	}

	public boolean pagar() {
		addItem(new Item(23.7));
		addItem(new Item(23.7));
		addItem(new Item(23.7));
		addItem(new Item(23.7));
		addItem(new Item(23.7));
		double totalCost = calcTotalCost();
		method = new Visa("fulano de tal", "7777", new Date());
		PagamentoContext context = new PagamentoContext(totalCost, method);
		System.out.println("Total da compra=" + context.getValorPagamento());
		return method.pagar(totalCost);
	}

	public static void main(String[] args) {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		new CarrinhoObserver(carrinhoCompras);
		carrinhoCompras.pagar();

	}
}
