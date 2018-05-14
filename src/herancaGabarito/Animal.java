package herancaGabarito;

public class Animal {

	private int peso;
	private double altura;
	private String cor;

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void comer() {
		System.out.println("Vamos encher a pan??a!");
	}

	public void dormir() {
		System.out.println("hora de dormir!");
	}

	public void andar() {
		System.out.println("andando por ai");
	}
	public void fazerBarulho() {
		System.out.println("Ta na hora de bagun??ar!");
	}
}