package classesAvancadasGabarito;

import designPatternsGabarito.UtilPrint;

public class ExternaEscopoReduzido extends UtilPrint {
	private int x = 10;

	public static void main(String[] args) {
		ExternaEscopoReduzido externaEscopoReduzido = new ExternaEscopoReduzido();
		externaEscopoReduzido.ver();

	}

	public void ver() {
		log("antes =" + x);
		class Interna {

			private Interna() {
				x = 0;
			}

		}
		Interna interna = new Interna();
		log("depois =" + x);
	}

}
