package designPatternsGabarito;

public class Funcionario {
	private long id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCargo(String cargo) {
		return Cargo.getCargoPorDescr(cargo).getId();
	}

}
