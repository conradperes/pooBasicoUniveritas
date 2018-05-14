package classesAvancadasGabarito;

import java.util.Date;

public class Empregado {
	public String nome;
	public Double salario;
	public Date dataAniversario;
	private static final double SALARIO_BASE = 15000.00;

	public Empregado(String nome, Double salario, Date dataAniversario) {

	}

	public Empregado(String nome, Double salario) {
		this(nome, salario, null);
		this.nome = nome;
		this.salario = salario;
		this.dataAniversario = dataAniversario;
	}

	public Empregado(String nome, Date dataAniversario) {
		this(nome, SALARIO_BASE, dataAniversario);
	}

	public Empregado(String nome) {
		this(nome, SALARIO_BASE);
	}
}