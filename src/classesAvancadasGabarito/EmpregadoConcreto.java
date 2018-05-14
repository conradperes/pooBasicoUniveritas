package classesAvancadasGabarito;

public class EmpregadoConcreto extends PessoaAbstrata {

	@Override
	void aumentaSalario(double percentual) {
		salario = salario * percentual + salario;
	}

}
