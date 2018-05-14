package herancaGabarito;

import java.util.Date;

public class TestaHeranca {

	public static void main(String[] args) {
		testaPolimorfismo();
		testaSuper();

	}

	private static void testaSuper() {
		Gerente e = new Gerente("Valdimir", 3983742.55, new Date(),
				"EA");
		System.out.print(e.pegaDetalhes()+e);
	}

	public static void testaPolimorfismo() {
		Empregado e = (Gerente) new Gerente("Valdimir", 3983742.55, new Date(),
				"EA");
		if (e instanceof Gerente) 
			System.out.print(e);
		
		Empregado e1 = (Empregado) new Gerente("Valdimir", 3983742.55, new Date(),
				"EA");
		if(e1 instanceof Empregado)
			System.out.println("\n"+e1.pegaDetalhes());
	}

}
