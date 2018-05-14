package herancaGabarito;

import java.util.Date;

public class Gerente extends Empregado {
	public Gerente(String nome, Double salario, Date dataAniversario) {
		super(nome, salario, dataAniversario);
	}

	public Gerente(String nome, Double salario, Date dataAniversario,
			String departamento) {
		super(nome, salario, dataAniversario);
		this.departamento = departamento;
	}

	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	public String departamento;
	

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Gerente [departamento=" + departamento + "]";
	}

	public String pegaDetalhes() {
		return super.pegaDetalhes() + this.toString();
	}

}
