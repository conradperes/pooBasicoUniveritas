package herancaGabarito;

public class Girafa extends Animal {
	
	
	public Girafa(int altura) {
		setAltura(altura);
	}

	public void verificarAltura(){
		if(getAltura()>1000){
			System.out.println("Muito alta essa girafa");
		}
	}

}
