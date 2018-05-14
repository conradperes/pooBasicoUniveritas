package classesAvancadasGabarito;

public abstract class PessoaAbstrata {
	protected double salario;

	abstract void aumentaSalario(double percentual);// Método abstrato sem
													// código

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
