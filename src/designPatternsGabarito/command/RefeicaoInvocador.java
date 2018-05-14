package designPatternsGabarito.command;

public class RefeicaoInvocador {
	Command command;

	public RefeicaoInvocador(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executar(){
		command.executar();
	}
	public void undo(){
		command.undo();
	}
	
}
