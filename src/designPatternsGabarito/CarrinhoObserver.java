package designPatternsGabarito;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class CarrinhoObserver implements Observer {

	Observable carrinhoCompras;
    
    int edicaoNovaRevista;
     
    public CarrinhoObserver(Observable carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
        carrinhoCompras.addObserver(this);
    }
     
    @Override
    public void update(Observable carrinhoComprasSubject, Object arg1) {
        if (carrinhoComprasSubject instanceof CarrinhoCompras) {
        	CarrinhoCompras revistaInformatica = (CarrinhoCompras) carrinhoComprasSubject;
            List<Item> items = revistaInformatica.getItems();
            for (Item item : items) {
				
            	System.out.println("Aten????o, Item adicionado ao carrinho: " + item.getPreco());
			}
        }
    }

}
