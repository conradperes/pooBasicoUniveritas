package classesInterfaces;

public class Conrad implements Pessoa{
	double salario;

	public Conrad(double salario) {
		super();
		this.salario = salario;
	}

	@Override
	public void pensa() {
		System.out.println("Tem que pensar muito pra dar aula!");
	}

	@Override
	public void respira() {
		
	}

	@Override
	public void trabalha() {
		System.out.println("Valia e Univeritas");
	}

	@Override
	public void pagaImpostos() {
		System.out.println("Impostos pagos="+salario*0.35);
		
	}

	@Override
	public void geraValorSociedade() {
		
	}

	@Override
	public void comer(String nomeComida, String tipoComida) {
		System.out.println("Esse cara come="+nomeComida+ "do Tipo="+tipoComida);
		
	}
	
	public void programar() {
		System.out.println("Conrad Programando");
	}

}
