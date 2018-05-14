package herancaGabarito;

import java.util.Date;

public class Diretor extends Gerente {
	public Double permiteCarro;

	public Diretor(String nome, Double salario, Date dataAniversario,
			String departamento) {
		super(nome, salario, dataAniversario, departamento);
	}

	public Diretor(String nome, Double salario, Date dataAniversario,
			Double permiteCarro) {
		super(nome, salario, dataAniversario);
		this.permiteCarro = permiteCarro;
	}

	public Double getPermiteCarro() {
		return permiteCarro;
	}

	public void setPermiteCarro(Double permiteCarro) {
		this.permiteCarro = permiteCarro;
	}
	
	public Double aumentaPermissionismo(){
		return permiteCarro++;
	}

}
