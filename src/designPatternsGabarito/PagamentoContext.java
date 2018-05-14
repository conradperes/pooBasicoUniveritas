package designPatternsGabarito;

public class PagamentoContext {
	double quantia;
	MetodoPagamentoStrategy strategy;

	public PagamentoContext(double quantia, MetodoPagamentoStrategy strategy) {
		this.quantia = quantia;
		this.strategy = strategy;
	}

	public void setStrategy(MetodoPagamentoStrategy strategy) {
		this.strategy = strategy;
	}

	public double getValorPagamento() {
		return quantia;
	}

	public boolean getResult() {
		return strategy.pagar(quantia);
	}

}
