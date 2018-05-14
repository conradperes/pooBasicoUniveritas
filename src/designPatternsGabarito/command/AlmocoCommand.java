package designPatternsGabarito.command;

public class AlmocoCommand implements Command {
	Almoco almoco;

	public AlmocoCommand(Almoco almoco) {
		this.almoco = almoco;
	}

	@Override
	public void executar() {
		almoco.fazerAlmoco();

	}

	@Override
	public void undo() {
		almoco.desmarcarAlmoco();

	}

}
