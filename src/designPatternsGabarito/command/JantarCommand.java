package designPatternsGabarito.command;

public class JantarCommand implements Command {
	Jantar jantar;

	public JantarCommand(Jantar jantar) {
		this.jantar = jantar;
	}

	@Override
	public void executar() {
		jantar.fazerJantar();

	}

	@Override
	public void undo() {
		jantar.desmarcarJantar();
	}

}
