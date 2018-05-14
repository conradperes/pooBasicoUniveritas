package designPatternsGabarito.command;

public class TestaRefeicaoCommand {

	public static void main(String[] args) {

		Almoco almoco = new Almoco();// receptor
		Command almocoCommand = new AlmocoCommand(almoco);// command concreto

		Jantar jantar = new Jantar();// receptor
		Command jantarCommand = new JantarCommand(jantar);

		RefeicaoInvocador refeicaoInvocador = new RefeicaoInvocador(
				almocoCommand);
		refeicaoInvocador.executar();
		refeicaoInvocador.undo();
		refeicaoInvocador.setCommand(jantarCommand);
		refeicaoInvocador.executar();
		refeicaoInvocador.undo();
	}

}
