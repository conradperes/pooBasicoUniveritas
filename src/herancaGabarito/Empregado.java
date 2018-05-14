package herancaGabarito;

import java.util.Date;

public class Empregado {
	public String nome;
	public Double salario;
	public Date dataAniversario;
	private String secreto;

	public Empregado(String nome, Double salario, Date dataAniversario) {
		this.nome = nome;
		this.salario = salario;
		this.dataAniversario = dataAniversario;
	}

	public Empregado() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public String pegaDetalhes() {
		return "Empregado [nome=" + nome + ", salario=" + salario
				+ ", dataAniversario=" + dataAniversario + "]";
	}

	public String getSecreto() {
		return secreto;
	}

	public void setSecreto(String secreto) {
		this.secreto = secreto;
	}

	public void trabalhar() {
		System.out.println("trabalhar");
	}

}
