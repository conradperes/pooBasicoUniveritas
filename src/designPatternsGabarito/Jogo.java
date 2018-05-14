package designPatternsGabarito;

public abstract class Jogo {
	private int regras;
	private String definicaoRegras;
	public int getRegras() {
		return regras;
	}

	public void setRegras(int regras) {
		this.regras = regras;
	}

	public String getDefinicaoRegras() {
		return definicaoRegras;
	}

	public void setDefinicaoRegras(String definicaoRegras) {
		this.definicaoRegras = definicaoRegras;
	}
	

}
