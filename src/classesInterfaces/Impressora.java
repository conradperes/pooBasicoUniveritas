package classesInterfaces;

import util.Utilidades;

public class Impressora {
	private String caminhoDocumento;

	public Impressora(String caminhoDocumento) {
		this.caminhoDocumento = caminhoDocumento;
	}

	public void imprimirDocumento() {
		Utilidades.print("Impressora imprime o documento=" + caminhoDocumento);
	}

}
