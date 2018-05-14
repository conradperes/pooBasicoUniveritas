package herancaGabarito;

public class Cachorro extends Animal {

	public void medirPeso(int peso) {
		setPeso(77);
		System.out.println("Esse fila eh pesado=" + getPeso());
	}

	public void dormir() {
		for (int i = 0; i < 5; i++) {
			super.dormir();
			System.out.println("especializacao");
		}
	}

}
