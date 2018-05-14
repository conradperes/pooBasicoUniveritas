package herancaGabarito;

public class Gato extends Animal {
	public void mia(){
		System.out.println("miando");
	}
	
	public void medirDimensoes(double altura, String cor, int peso){
		setAltura(altura);
		setCor(cor);
		setPeso(peso);
		if(getPeso()>30){
			System.out.println("Pesadao esse gato!");
		}
	}
}
