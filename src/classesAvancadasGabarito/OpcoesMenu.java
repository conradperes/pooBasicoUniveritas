package classesAvancadasGabarito;
public enum OpcoesMenu {
	SALVAR(1), IMPRIMIR(2), ABRIR(3), DEBUGAR(4), FECHAR(5), EDITAR(6);

	private final int valor;

	private OpcoesMenu(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
}
